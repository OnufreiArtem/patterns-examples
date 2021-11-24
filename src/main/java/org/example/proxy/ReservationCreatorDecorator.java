package org.example.proxy;

public class ReservationCreatorDecorator implements ReservationCreator {

	protected final ReservationCreator reservationCreator;

	public ReservationCreatorDecorator(ReservationCreator reservationCreator) {
		this.reservationCreator = reservationCreator;
	}

	@Override
	public void createReservation(Reservation reservation) {
		reservationCreator.createReservation(reservation);
	}
}
