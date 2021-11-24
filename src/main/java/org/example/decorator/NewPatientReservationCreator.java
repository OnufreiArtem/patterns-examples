package org.example.decorator;

public class NewPatientReservationCreator extends ReservationCreatorDecorator {

	public NewPatientReservationCreator(ReservationCreator reservationCreator) {
		super(reservationCreator);
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
