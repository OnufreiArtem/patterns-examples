package org.example.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient implements Comparable<Patient> {
	private String name;
	private LocalDate lastlyVaccinated = null;
	private VaccinationMediator vaccinationMediator;

	public Patient(String name, VaccinationMediator vaccinationMediator) {
		this.name = name;
		this.vaccinationMediator = vaccinationMediator;
	}

	public void addToVaccinationQueue() {
		System.out.println(name + " wants to vaccinate.");
		vaccinationMediator.addToQueue(this);
	}

	@Override
	public int compareTo(Patient patient) {
		return 0;
	}
}
