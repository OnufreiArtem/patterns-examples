package org.example.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class VaccinationMediator {

	private final Queue<Patient> vaccinationList = new PriorityQueue<>();
	private final List<Doctor> doctorList = new ArrayList<>();

	public VaccinationMediator() {
	}

	public void initiate() {
		for (int i = 0; i < vaccinationList.size(); i++) {
			vaccinateFirstPatient();
		}
	}

	public void addToQueue(Patient patient) {
		vaccinationList.add(patient);
	}

	public void addDoctor(Doctor doctor) {
		doctorList.add(doctor);
	}

	public void isBusy(Doctor doctor) {
		doctorList.remove(doctor);
	}

	public void free(Doctor doctor) {
		doctorList.add(doctor);
		vaccinateFirstPatient();
	}

	public void vaccinateFirstPatient() {
		if (doctorList.size() <= 0) {
			return;
		}
		try {
			Patient firstPatient = vaccinationList.poll();
			if(firstPatient == null) {
				return;
			}
			doctorList.get(0).vaccinate(firstPatient);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
