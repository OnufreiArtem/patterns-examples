package org.example.state;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Doctor doctor = new Doctor("Jon Snow", "Therapist");
		Patient patient = new Patient("Tyrion Lannister", LocalDate.now().minusYears(46));
		Reservation reservation = new Reservation(doctor, patient, LocalDateTime.now(), new FutureReservationState());
		System.out.println("Reservation status: " + reservation.getStatus());
		doctor.handleReservation(reservation);
	}

}
