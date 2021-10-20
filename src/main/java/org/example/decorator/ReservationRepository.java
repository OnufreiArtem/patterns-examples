package org.example.decorator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationRepository {

	private final List<Reservation> reservations;

	private static ReservationRepository instance;

	private ReservationRepository() {
		this.reservations = new ArrayList<Reservation>() {{
			add(new Reservation("Patient 1", "Doctor 1", LocalDateTime.now().minusDays(3)));
			add(new Reservation("Patient 1", "Doctor 2", LocalDateTime.now().minusDays(2)));
			add(new Reservation("Patient 3", "Doctor 1", LocalDateTime.now().minusDays(4)));
			add(new Reservation("Patient 2", "Doctor 3", LocalDateTime.now().plusDays(2)));
		}};
	}

	public static ReservationRepository getInstance() {
		if (instance == null) {
			instance = new ReservationRepository();
		}
		return instance;
	}

	public List<Reservation> getAllReservations() {
		return reservations;
	}

	public void addReservation(Reservation r) {
		reservations.add(r);
	}
}
