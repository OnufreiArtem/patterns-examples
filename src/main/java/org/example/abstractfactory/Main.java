package org.example.abstractfactory;


import org.example.abstractfactory.model.Employee;
import org.example.factory.DoctorFactory;
import org.example.factory.NurseFactory;
import org.example.factory.model.Doctor;
import org.example.factory.model.Nurse;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

	static List<Employee> employeeList = new ArrayList<>();

	public static void main(String[] args) {
		 employDoctorAndNurse(
		 		 new MaternityFactory(),
				 new Person("Doctor from Maternity", "12-02-1965", "University"),
				 new Person("Nurse from Maternity", "12-02-1995", "University")
		 );

		employDoctorAndNurse(
				new TraumatologyFactory(),
				new Person("Doctor from Traumatology", "12-02-1967", "University"),
				new Person("Nurse from Traumatology", "12-02-1994", "University")
		);

		employeeList.forEach(System.out::println);
	}

	static void employDoctorAndNurse(EmploymentFactory employmentFactory, Person doctor, Person nurse) {
		employeeList.add(employmentFactory.createDoctor(doctor.name, doctor.dob, doctor.education));
		employeeList.add(employmentFactory.createNurse(nurse.name, nurse.dob, nurse.education));
	}

	static class Person {
		public String name;
		public String dob;
		public String education;

		public Person(String name, String dob, String education) {
			this.name = name;
			this.dob = dob;
			this.education = education;
		}
	}

}
