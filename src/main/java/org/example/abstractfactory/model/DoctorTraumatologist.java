package org.example.abstractfactory.model;

public class DoctorTraumatologist extends Doctor {
	public DoctorTraumatologist(String name, String dob, String education) {
		super(name, dob, education);
	}

	@Override
	public String toString() {
		return "I am therapist: " + super.toString();
	}
}
