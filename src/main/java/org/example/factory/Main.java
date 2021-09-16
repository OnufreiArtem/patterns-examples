package org.example.factory;

import org.example.factory.model.Patient;
import org.example.factory.model.Reservation;

import java.util.Arrays;

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

		Reservation reservation1 = idFactory.createReservation(patient1);
		Reservation reservation2 = mFactory.createReservation(patient2);
		Reservation reservation3 = rFactory.createReservation(patient3);
		Reservation reservation4 = idFactory.createReservation(patient4);
		Reservation reservation5 = mFactory.createReservation(patient5);

		printAll(reservation1, reservation2, reservation3, reservation4, reservation5);
	}

	static void printAll(Reservation ...reservations) {
		Arrays.stream(reservations).forEach(System.out::println);
	}
}
