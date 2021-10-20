package org.example.facade;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {
		VacationRepository vacationRepository = new VacationRepository();
		ReservationRepository reservationRepository = new ReservationRepository();

		ReservationService reservationService = new ReservationService(vacationRepository, reservationRepository);
		System.out.println("Reservation status : " + reservationService.registerReservation("Patient 1", "Doctor 1", LocalDateTime.now()));
		System.out.println("Reservation status : " + reservationService.registerReservation("Patient 2", "Doctor 1", LocalDateTime.now().plusDays(30)));

	}
}
