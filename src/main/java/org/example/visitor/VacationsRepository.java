package org.example.visitor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VacationsRepository {

	private List<VacationDay<Doctor>> doctorVacationDays = new ArrayList<>();
	private List<VacationDay<Nurse>> nurseVacationDays = new ArrayList<>();

	private static VacationsRepository instance = new VacationsRepository();

	private VacationsRepository() {
	}

	public static VacationsRepository getInstance() {
		if (instance == null) {
			instance = new VacationsRepository();
		}

		return instance;
	}

	public VacationsRepository addDoctorVacationDay(VacationDay<Doctor> day) {
		doctorVacationDays.add(day);
		return this;
	}

	public VacationsRepository addNurseVacationDay(VacationDay<Nurse> day) {
		nurseVacationDays.add(day);
		return this;
	}

	public VacationsRepository removeDoctorVacationDay(VacationDay<Doctor> day) {
		doctorVacationDays = doctorVacationDays.stream().filter(d -> d.getEmployee().equals(day.getEmployee())
				&& d.getDay().equals(day.getDay())).collect(Collectors.toList());
		return this;
	}

	public VacationsRepository removeNurseVacationDay(VacationDay<Nurse> day) {
		nurseVacationDays = nurseVacationDays.stream().filter(d -> d.getEmployee().equals(day.getEmployee())
				&& d.getDay().equals(day.getDay())).collect(Collectors.toList());
		return this;
	}

	public List<LocalDate> getFutureVacationDaysFor(Doctor doctor) {
		return doctorVacationDays.stream().filter(d -> d.getDay().isAfter(LocalDate.now())
				&& d.getEmployee().equals(doctor)).map(VacationDay::getDay).collect(Collectors.toList());
	}

	public List<LocalDate> getFutureVacationDaysFor(Nurse nurse) {
		return nurseVacationDays.stream().filter(d -> d.getDay().isAfter(LocalDate.now())
				&& d.getEmployee().equals(nurse)).map(VacationDay::getDay).collect(Collectors.toList());
	}

}
