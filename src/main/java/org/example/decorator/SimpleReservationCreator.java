package org.example.decorator;

public class SimpleReservationCreator implements ReservationCreator {

	@Override
	public void createReservation(Reservation reservation) {
		System.out.println("Adding new reservation....");
		ReservationRepository.getInstance().addReservation(reservation);
	}
}
