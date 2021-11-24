package org.example.visitor;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Doctor doctor0 = Doctor.builder()
				.name("Doctor 0")
				.department("Department 0")
				.specification("Specification 0")
				.room("123a")
				.salary(15000)
				.build();

		Doctor doctor1 = Doctor.builder()
				.name("Doctor 1")
				.department("Department 1")
				.specification("Specification 1")
				.room("423a")
				.salary(16000)
				.build();

		Nurse nurse0 = Nurse.builder()
				.name("Nurse 0")
				.department("Department 0")
				.salary(8000)
				.build();

		Nurse nurse1 = Nurse.builder()
				.name("Nurse 1")
				.department("Department 1")
				.salary(9000)
				.build();

		VacationsRepository.getInstance()
				.addDoctorVacationDay(new VacationDay<>(doctor0, LocalDate.now().plusDays(12)))
				.addDoctorVacationDay(new VacationDay<>(doctor0, LocalDate.now().plusDays(13)))
				.addDoctorVacationDay(new VacationDay<>(doctor0, LocalDate.now().plusDays(14)))
				.addDoctorVacationDay(new VacationDay<>(doctor0, LocalDate.now().plusDays(15)))
				.addDoctorVacationDay(new VacationDay<>(doctor1, LocalDate.now().plusDays(4)))
				.addNurseVacationDay(new VacationDay<>(nurse0, LocalDate.now().minusDays(1)))
				.addNurseVacationDay(new VacationDay<>(nurse0, LocalDate.now().plusDays(30)))
				.addNurseVacationDay(new VacationDay<>(nurse0, LocalDate.now().plusDays(31)))
				.addNurseVacationDay(new VacationDay<>(nurse0, LocalDate.now().plusDays(32)))
				.addNurseVacationDay(new VacationDay<>(nurse1, LocalDate.now().plusDays(33)))
				.addNurseVacationDay(new VacationDay<>(nurse1, LocalDate.now().plusDays(34)));

		TaxEmployeeVisitor taxEmployeeVisitor = new TaxEmployeeVisitor();
		VacationEmployeeVisitor vacationEmployeeVisitor = new VacationEmployeeVisitor();

		System.out.println("----------------Taxes to pay-----------------");
		outputTax(doctor0, taxEmployeeVisitor);
		outputTax(doctor1, taxEmployeeVisitor);
		outputTax(nurse0, taxEmployeeVisitor);
		outputTax(nurse1, taxEmployeeVisitor);
		System.out.println();
		System.out.println("----------------Vacation days----------------");
		outputVacationsDay(doctor0, vacationEmployeeVisitor);
		outputVacationsDay(doctor1, vacationEmployeeVisitor);
		outputVacationsDay(nurse0, vacationEmployeeVisitor);
		outputVacationsDay(nurse1, vacationEmployeeVisitor);

	}

	private static void outputTax(Doctor employee, TaxEmployeeVisitor visitor) {
		System.out.println("Doctor: \"" + employee.getName() + "\" has to pay " + employee.accept(visitor));
	}

	private static void outputTax(Nurse employee, TaxEmployeeVisitor visitor) {
		System.out.println("Nurse: \"" + employee.getName() + "\" has to pay " + employee.accept(visitor));
	}

	private static void outputVacationsDay(Doctor employee, VacationEmployeeVisitor visitor) {
		System.out.println("Doctor: \"" + employee.getName() + "\" has " + employee.accept(visitor) + " vacation days");
	}

	private static void outputVacationsDay(Nurse employee, VacationEmployeeVisitor visitor) {
		System.out.println("Nurse: \"" + employee.getName() + "\" has " + employee.accept(visitor) + " vacation days");
	}

}
