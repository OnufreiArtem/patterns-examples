package org.example.abstractfactory.model;

public class DoctorAccoucheur extends Doctor {
	public DoctorAccoucheur(String name, String dob, String education) {
		super(name, dob, education);
	}

	@Override
	public String toString() {
		return "I am accoucheur: " + super.toString();
	}
}
