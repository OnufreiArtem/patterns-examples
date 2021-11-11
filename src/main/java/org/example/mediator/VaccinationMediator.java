package org.example.mediator;

import java.time.Duration;
import java.time.LocalDate;

public class VaccinationMediator {

	private final Patient patient;
	private final Doctor doctor;

	public VaccinationMediator(Patient patient, Doctor doctor) {
		this.patient = patient;
		this.doctor = doctor;
	}

	public void vaccinate() {
		System.out.println("Attempted to vaccinate patient: " + patient.getName());
		LocalDate lastlyVaccinated = patient.getLastlyVaccinated();
		if (lastlyVaccinated == null || isDateOlderThanSixMonth(lastlyVaccinated)) {
			doctor.vaccinateAndGetCertificate(patient);
		}
	}

	public boolean isDateOlderThanSixMonth(LocalDate localdate) {
		return LocalDate.now().minusMonths(6L).isAfter(localdate);
	}

	public void giveCertificate(String certificate) {
		patient.giveCertificate(certificate);
	}

}
