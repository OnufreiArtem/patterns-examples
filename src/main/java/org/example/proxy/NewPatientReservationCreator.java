package org.example.proxy;

public class NewPatientReservationCreator implements ReservationCreator {

	private final ReservationCreator reservationCreator;

	public NewPatientReservationCreator(ReservationCreator reservationCreator) {
		this.reservationCreator = reservationCreator;
	}

	@Override
	public void createReservation(Reservation reservation) {
		if (PatientRepository.getInstance().getAllPatients().stream().noneMatch(it -> it.getName().equals(reservation.getPatient()))) {
			System.out.println("Such patient does not exist. Adding him to the system");
			PatientRepository.getInstance().addPatient(new Patient(reservation.getPatient()));
		}

		reservationCreator.createReservation(reservation);
	}
}
