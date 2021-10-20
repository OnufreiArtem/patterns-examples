package org.example.proxy;

public class PatientReservationCreator implements ReservationCreator {

	@Override
	public void createReservation(Reservation reservation) {
		System.out.println("Adding new reservation....");
		ReservationRepository.getInstance().addReservation(reservation);
	}
}
