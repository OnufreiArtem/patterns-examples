package org.example.strategy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VaccinationController {

	private List<DoctorHolder> doctorList = new ArrayList<>();
	private List<PatientHolder> patientList = new ArrayList<>();

	private VaccinationLoadBalancer vaccinationLoadBalancer = new QueueVaccinationLoadBalancer();

	private static VaccinationController instance = new VaccinationController();

	private VaccinationController() {
	}

	public static VaccinationController getInstance() {
		if (instance == null) instance = new VaccinationController();
		return instance;
	}

	public void vaccinate() {
		List<DoctorHolder> freeDoctors = doctorList.stream().filter(DoctorHolder::getFree).collect(Collectors.toList());
		Pair<Patient, Doctor> pair = vaccinationLoadBalancer.getNext(patientList, freeDoctors);
		doctorList.forEach(dh -> {
			if (pair.second == dh.getDoctor()) {
				dh.setFree(false);
				dh.getDoctor().vaccinate(pair.first, this::notifyAvailability);
			}
		});

		patientList = patientList.stream().filter(it -> it.getPatient() != pair.first).collect(Collectors.toList());
	}

	public void notifyAvailability(Doctor doctor) {
		doctorList.forEach(dh -> {
			if (dh.getDoctor().equals(doctor)) {
				dh.setFree(true);
			}
		});
	}

	public VaccinationController addDoctor(Doctor d) {
		doctorList.add(DoctorHolder.builder().doctor(d).isFree(true).build());
		return this;
	}

	public VaccinationController addPatient(Patient p, LocalDateTime time) {
		patientList.add(new PatientHolder(p, time));
		return this;
	}

	public VaccinationController removeDoctor(Doctor d) {
		doctorList = doctorList.stream().filter(dh -> dh.getDoctor() != d).collect(Collectors.toList());
		return this;
	}

	public VaccinationController removePatient(Patient p) {
		patientList = patientList.stream().filter(it -> it.getPatient() != p).collect(Collectors.toList());
		return this;
	}

	public VaccinationLoadBalancer getVaccinationLoadBalancer() {
		return vaccinationLoadBalancer;
	}

	public void setVaccinationLoadBalancer(VaccinationLoadBalancer vaccinationLoadBalancer) {
		this.vaccinationLoadBalancer = vaccinationLoadBalancer;
	}

}
