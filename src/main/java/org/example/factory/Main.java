package org.example.factory;

import org.example.factory.DoctorFactory;
import org.example.factory.EmploymentFactory;
import org.example.factory.NurseFactory;
import org.example.factory.model.Doctor;
import org.example.factory.model.Nurse;

public class Main {

	public static void main(String[] args) {
		EmploymentFactory dFactory = new DoctorFactory();
		EmploymentFactory nFactory = new NurseFactory();

		Doctor doctor = (Doctor) dFactory.createWorker("Doctor 1", "12-01-1989", "University");
		Nurse nurse = (Nurse) nFactory.createWorker("Nurse 1", "01-02-1999", "University");

		System.out.println(doctor);
		System.out.println(nurse);

	}
}
