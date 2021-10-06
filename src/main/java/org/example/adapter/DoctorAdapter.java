package org.example.adapter;

import org.example.adapter.model.Doctor;
import org.example.adapter.model.Nurse;

public class DoctorAdapter extends Nurse {

	private Doctor doctor;

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public void applyFirstAid() {
		System.out.println(doctor.getName() + " applies first aid....");
	}

}
