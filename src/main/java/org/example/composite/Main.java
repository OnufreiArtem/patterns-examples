package org.example.composite;

import org.example.composite.models.Department;
import org.example.composite.models.Doctor;
import org.example.composite.models.Institution;
import org.example.composite.models.Nurse;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Institution institution = new Institution("Private medical center", new ArrayList<>());

		Department department1 = new Department("Department 1", new ArrayList<>());
		Department department2 = new Department("Department 2", new ArrayList<>());

		department1
				.addEmployee(new Doctor("Doctor 1", "Specification 1", LocalDate.now().minusYears(30), 1500 ))
				.addEmployee(new Doctor("Doctor 2", "Specification 2", LocalDate.now().minusYears(35), 1500 ))
				.addEmployee(new Doctor("Doctor 3", "Specification 3", LocalDate.now().minusYears(27), 2000 ))
				.addEmployee(new Nurse("Nurse 1", LocalDate.now().minusYears(20), 1000 ))
				.addEmployee(new Nurse("Nurse 2", LocalDate.now().minusYears(23), 1000 ))
				.addEmployee(new Nurse("Nurse 3", LocalDate.now().minusYears(26), 1200 ));

		department2
				.addEmployee(new Doctor("Doctor 4", "Specification 1", LocalDate.now().minusYears(30), 1500 ))
				.addEmployee(new Doctor("Doctor 5", "Specification 2", LocalDate.now().minusYears(35), 1500 ))
				.addEmployee(new Doctor("Doctor 6", "Specification 3", LocalDate.now().minusYears(27), 1500 ))
				.addEmployee(new Nurse("Nurse 4", LocalDate.now().minusYears(20), 1000 ))
				.addEmployee(new Nurse("Nurse 5", LocalDate.now().minusYears(23), 1000 ))
				.addEmployee(new Nurse("Nurse 6", LocalDate.now().minusYears(26), 1500 ));

		institution
				.addDepartment(department1)
				.addDepartment(department2);

		System.out.println("Full salary is " + institution.getFullSalary());

	}

}
