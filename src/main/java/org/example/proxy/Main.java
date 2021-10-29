package org.example.proxy;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {

		ReservationCreator reservationCreator = new SimpleReservationCreator();
		ReservationCreator reservationCreator1 = new ProxyReservationCreator();

		//Bad way
		reservationCreator.createReservation(Reservation.builder().doctor("Doctor 1").patient("Patient 17").time(LocalDateTime.now().plusMinutes(10)).build());
		//Better w
		try {
			reservationCreator1.createReservation(
					Reservation.builder().doctor("Doctor 1").patient("Patient 88").time(LocalDateTime.now().plusMinutes(10)).build());
		} catch (RuntimeException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
