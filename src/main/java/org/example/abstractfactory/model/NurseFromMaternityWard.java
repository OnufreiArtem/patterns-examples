package org.example.abstractfactory.model;

public class NurseFromMaternityWard extends Employee{
	public NurseFromMaternityWard(String name, String dob, String education) {
		super(name, dob, education);
	}

	@Override
	public String toString() {
		return "I am Nurse from Maternity Ward: " + super.toString();
	}
}
