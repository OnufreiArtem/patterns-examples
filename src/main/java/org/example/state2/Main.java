package org.example.state2;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Doctor doctor0 = Doctor.builder().name("Doctor 0").speciality("therapist").doctorState(new FreeDoctorState()).build();
		Doctor doctor1 = Doctor.builder().name("Doctor 1").speciality("therapist").doctorState(new BusyDoctorState()).build();
		Doctor doctor2 = Doctor.builder().name("Doctor 1").speciality("therapist").doctorState(new OnVacationDoctorState()).build();

		DoctorRepository.getInstance().addDoctor(doctor0);
		DoctorRepository.getInstance().addDoctor(doctor1);
		DoctorRepository.getInstance().addDoctor(doctor2);

		Patient patient0 = Patient.builder().name("Patient 0").dob(LocalDate.now().minusYears(20)).build();
		Patient patient1 = Patient.builder().name("Patient 1").dob(LocalDate.now().minusYears(21)).build();
		Patient patient2 = Patient.builder().name("Patient 2").dob(LocalDate.now().minusYears(24)).build();

		System.out.println("Doctor 0 ------------------------");
		doctor0.serve(patient0);
		System.out.println();
		System.out.println("Doctor 1 ------------------------");
		doctor1.serve(patient1);
		System.out.println();
		System.out.println("Doctor 2 ------------------------");
		doctor2.serve(patient2);
		System.out.println();

	}
}
