package org.example.mediator;

public class Main {
	public static void main(String[] args) {
		Patient patient = new Patient();
		patient.setName("James Tiberius Kirk");
		Doctor doctor = new Doctor();
		doctor.setName("Dr. Leonard H. \"Bones\" McCoy");

		VaccinationMediator vaccinationMediator = new VaccinationMediator(patient, doctor);

		patient.setVaccinationMediator(vaccinationMediator);
		doctor.setVaccinationMediator(vaccinationMediator);

		patient.getVaccinated();
	}
}
