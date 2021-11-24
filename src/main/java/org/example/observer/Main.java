package org.example.observer;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Doctor doctor = new Doctor("Will Smith", "Therapist");
		Patient patient1 = new Patient("Arnold Schwarzenegger", LocalDate.now().minusYears(74));
		Patient patient2 = new Patient("Sylvester Stallone", LocalDate.now().minusYears(75));
		DoctorVaccinationPublisher doctorVaccinationPublisher = new DoctorVaccinationPublisher(doctor);
		doctorVaccinationPublisher.subscribe(patient1);
		doctorVaccinationPublisher.subscribe(patient2);

		doctorVaccinationPublisher.setMessage("It is time to vaccinate!!!");
		doctorVaccinationPublisher.notifySubscribers();

	}
}
