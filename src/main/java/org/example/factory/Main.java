package org.example.factory;

import org.example.factory.model.Employee;

public class Main {

	public static void main(String[] args) {
		EmploymentFactory dFactory = new DoctorFactory();
		EmploymentFactory nFactory = new NurseFactory();

		Employee doctor = employ(dFactory, "Doctor 1", "12-01-1989", "University");
		Employee nurse = employ(nFactory, "Nurse 1", "01-02-1999", "University");

		System.out.println(doctor);
		System.out.println(nurse);

	}

	static Employee employ(EmploymentFactory employmentFactory, String name, String dob, String education) {
		return employmentFactory.createWorker(name, dob, education);
	}
}
