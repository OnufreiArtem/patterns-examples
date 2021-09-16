package org.example.factory;

import org.example.factory.model.Patient;
import org.example.factory.repository.FakeReservationRepo;

public class Main {
	public static void main(String[] args) {
		ReservationFactory idFactory = new InfectiousDiseasesDepFactory();
		ReservationFactory mFactory = new MaternityDepFactory();
		ReservationFactory rFactory = new ResuscitationDepFactory();

		Patient patient1 = new Patient("Patient 1", "13-01-2002");
		Patient patient2 = new Patient("Patient 2", "14-02-2001");
		Patient patient3 = new Patient("Patient 3", "15-03-2000");
		Patient patient4 = new Patient("Patient 4", "16-04-1999");
		Patient patient5 = new Patient("Patient 5", "17-05-1998");

		idFactory.createReservation(patient1);
		mFactory.createReservation(patient2);
		rFactory.createReservation(patient3);
		idFactory.createReservation(patient4);
		mFactory.createReservation(patient5);

		FakeReservationRepo.getInstance().getReservationList().forEach(System.out::println);
	}
}
