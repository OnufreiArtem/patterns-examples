package org.example.mediator;

public class Main {
	public static void main(String[] args) {
		VaccinationMediator vaccinationMediator = new VaccinationMediator();

		new Patient("Natasha", vaccinationMediator).addToVaccinationQueue();
		new Patient("Bruce", vaccinationMediator).addToVaccinationQueue();
		new Patient("Steve", vaccinationMediator).addToVaccinationQueue();
		new Patient("Loki", vaccinationMediator).addToVaccinationQueue();
		new Patient("Thor", vaccinationMediator).addToVaccinationQueue();

		new Doctor("Doctor Strange", vaccinationMediator).addToVaccinationDoctors();
		new Doctor("Peter", vaccinationMediator).addToVaccinationDoctors();

		vaccinationMediator.initiate();

	}
}
