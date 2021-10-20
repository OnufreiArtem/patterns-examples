package org.example.proxy;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {
		Reservation reservation1 = new Reservation("Patient 1", "Doctor 4", LocalDateTime.now().plusDays(3));
		Reservation reservation2 = new Reservation("Patient 23", "Doctor 5", LocalDateTime.now().plusDays(5));
		Reservation reservation3 = new Reservation("Patient 3", "Doctor 4", LocalDateTime.now().plusDays(2));
		Reservation reservation4 = new Reservation("Patient 7", "Doctor 3", LocalDateTime.now().plusDays(6));

		ReservationCreator reservationCreator1 = new PatientReservationCreator();
		ReservationCreator reservationCreator2 = new NewPatientReservationCreator(reservationCreator1);

		System.out.println("PatientReservationCreator: ");
		reservationCreator1.createReservation(reservation1);
		reservationCreator1.createReservation(reservation2);
		System.out.println("\nNewPatientReservationCreator: ");
		reservationCreator2.createReservation(reservation3);
		reservationCreator2.createReservation(reservation4);

	}

	public static ReservationCreator createReservationCreator(Class<? extends ReservationCreator> creatorClass) {
		try {
			return creatorClass.newInstance();
		} catch (Exception e) {
			return null;
		}
	}
}
