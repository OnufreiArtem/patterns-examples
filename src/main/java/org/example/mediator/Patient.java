package org.example.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	private String name;
	private LocalDate lastlyVaccinated = null;
	private VaccinationMediator vaccinationMediator;


	public void getVaccinated() {
		vaccinationMediator.vaccinate();
	}

	public void giveCertificate(String certificate) {
		System.out.println("Here is my certificate: " + certificate);
	}
}
