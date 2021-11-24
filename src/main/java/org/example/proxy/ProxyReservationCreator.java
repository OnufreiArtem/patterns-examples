package org.example.proxy;

public class ProxyReservationCreator implements ReservationCreator {

	private final ReservationCreator reservationCreator = new SimpleReservationCreator();

	@Override
	public void createReservation(Reservation reservation) {
		if (!PatientRepository.getInstance().exists(reservation.getPatient())) {
			throw new RuntimeException("Specified patient is not registered in the system");
		}
		validateReservation(reservation);

		reservationCreator.createReservation(reservation);
	}

	public void validateReservation(Reservation reservation) {
		if (ReservationRepository.getInstance().getAllReservations().stream().filter(it -> it.getDoctor().equals(reservation.getDoctor()))
				.anyMatch(it -> it.getTime().isAfter(reservation.getTime()) && it.getTime().isBefore(reservation.getTime().plusMinutes(45)))) {
			throw new RuntimeException("Doctor is busy at this time");
		}
	}

}
