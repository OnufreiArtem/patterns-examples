package org.example.objectpool;

import org.example.objectpool.model.Doctor;

import java.util.Stack;

public class DoctorPool {

	private final Stack<Doctor> free = new Stack<>();
	private final Stack<Doctor> inUse = new Stack<>();

	public DoctorPool() {
		free.addAll(DoctorRepository.doctorList);
	}

	public Doctor getDoctor() {
		if (free.size() > 0) {
			Doctor doctor = free.pop();
			inUse.push(doctor);
			System.out.println(doctor.getName() + " is busy now");
			return doctor;
		}
		System.out.println("No available doctors now");
		return null;
	}

	public void returnDoctor(Doctor doctor) {
		inUse.remove(doctor);
		free.push(doctor);
		System.out.println(doctor.getName() + " is free now");
	}

	public void displayState() {
		System.out.println("There are [" + free.size() + "] free objects and [" + inUse.size() + "] busy objects");
	}

}
