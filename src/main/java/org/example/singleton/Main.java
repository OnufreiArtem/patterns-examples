package org.example.singleton;

import org.example.singleton.model.Doctor;
import org.example.singleton.repo.FakeDoctorDatasource;

public class Main {

	public static void main(String[] args) {

		System.out.println("-------------------SINGLETON EXAMPLE-------------------");
		Doctor first = new Doctor("Will SMITH", "PHD");
		Doctor second = new Doctor("Jan Pol", "PHD");
		Doctor third = new Doctor("Michelle Oakley", "PHD");

		displayDoctors("Initial datasource:");
		FakeDoctorDatasource.getInstance().add(first);
		displayDoctors("Added first doctor:");
		FakeDoctorDatasource.getInstance().addMany(second, third);
		displayDoctors("Added second and third doctor:");
		first.setName("Brenda Grettenberger");
		FakeDoctorDatasource.getInstance().update(first);
		displayDoctors("Updated first doctor:");
		FakeDoctorDatasource.getInstance().remove(first.getId());
		displayDoctors("Removed first doctor:");

		System.out.println("------------------------THE END-----------------------");
	}


	public static void displayDoctors(String message) {
		System.out.println(message);
		FakeDoctorDatasource.getInstance().getAll().forEach(System.out::println);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
	}


}
