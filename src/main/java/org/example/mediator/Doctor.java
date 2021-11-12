package org.example.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

	private String name;
	private VaccinationMediator vaccinationMediator;

	public void vaccinate(Patient patient) throws InterruptedException {
		vaccinationMediator.isBusy(this);
		System.out.println(name + " vaccinate " + patient.getName() + "...");
		Thread.sleep(1000);
		System.out.println(name + " successfully vaccinated " + patient.getName());
		vaccinationMediator.free(this);
	}

	public void addToVaccinationDoctors() {
		vaccinationMediator.addDoctor(this);
	}
}
