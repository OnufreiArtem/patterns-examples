package org.example.abstractfactory.model;

public class NurseFromTraumatology extends Nurse{
	public NurseFromTraumatology(String name, String dob, String education) {
		super(name, dob, education);
	}

	@Override
	public String toString() {
		return "I am Nurse from Traumatology: " + super.toString();
	}
}
