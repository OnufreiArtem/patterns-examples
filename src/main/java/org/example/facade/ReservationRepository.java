package org.example.facade;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationRepository {

	List<Reservation> reservations = new ArrayList<>();

	public ReservationRepository() {
		reservations.add(new Reservation("Patient 1", "Doctor 1", LocalDateTime.now().minusDays(10)));
		reservations.add(new Reservation("Patient 1", "Doctor 1", LocalDateTime.now().minusDays(5)));
		reservations.add(new Reservation("Patient 2", "Doctor 2", LocalDateTime.now()));
		reservations.add(new Reservation("Patient 1", "Doctor 1", LocalDateTime.now().plusDays(10)));
	}

	public List<Reservation> getAllReservations() {
		return reservations;
	}

	public void addReservation(Reservation reservation) {
		reservations.add(reservation);
	}


}
