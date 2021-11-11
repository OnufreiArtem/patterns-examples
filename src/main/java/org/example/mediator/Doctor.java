package org.example.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

	private String name;
	private VaccinationMediator vaccinationMediator;

	public void vaccinateAndGetCertificate(Patient patient) {
		System.out.println("Vaccinating " + patient.getName() + " ...");
		patient.setLastlyVaccinated(LocalDate.now());
		System.out.println(name + " successfully vaccinated " + patient.getName());
		vaccinationMediator.giveCertificate("Patient " + patient.getName() + " was vaccinated on " + LocalDate.now() + " by " + name);
	}
}
