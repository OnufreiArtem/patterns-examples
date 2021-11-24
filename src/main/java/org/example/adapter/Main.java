package org.example.adapter;

import org.example.adapter.model.Nurse;
import org.example.adapter.model.Doctor;
import org.example.adapter.model.Patient;

public class Main {
	public static void main(String[] args) {
		Doctor doctor = new Doctor(1L, "Doctor 1", "Some specification", "Some department");
		Nurse nurse = new Nurse(1L, "Nurse 1", "Some department");
		DoctorAdapter doctorAdapter = new DoctorAdapter();
		doctorAdapter.setDoctor(doctor);

		Patient patient = new Patient(1L, "Patient 1", "Problem");

		patient.getFirstAid(nurse);
		patient.getFirstAid(doctorAdapter);
	}
}
