package org.example.builder;

import org.example.builder.model.Doctor;

import java.time.LocalDate;
import java.time.Month;

public class Main {
	public static void main(String[] args) {
		Doctor doctor = Doctor.builder()
				.setName("Artem")
				.setSurname("Onufrei")
				.setDateOfBirth(LocalDate.of(2002, Month.JANUARY, 13))
				.build();

		System.out.println(doctor);

	}
}
