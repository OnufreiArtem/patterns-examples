package org.example.memento;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Doctor doctor = new Doctor("Doctor 1", "Specification 1");
		Patient patient = new Patient("Patient 1", LocalDate.now().minusYears(23));
		Reservation reservation = new Reservation(doctor, patient, LocalDateTime.now());
		System.out.println("Initial reservation: " + reservation);
		Thread.sleep(100);
		ReservationSnapshotRegistry.getInstance().saveSnapshot(reservation.makeSnapshot());
		reservation.setDate(LocalDateTime.now().plusDays(2));
		System.out.println("Moved reservation to plus 2 days: " + reservation);
		Thread.sleep(100);
		ReservationSnapshotRegistry.getInstance().saveSnapshot(reservation.makeSnapshot());
		reservation.setDate(LocalDateTime.now().plusDays(4));
		Thread.sleep(100);
		System.out.println("Moved reservation to plus another 2 days: " + reservation);

		System.out.println("\nRollback process\n");
		reservation.restoreFromSnapshot(ReservationSnapshotRegistry.getInstance().popLastSnapshot(reservation.getId()));
		System.out.println("Reservation is: " + reservation);
		reservation.restoreFromSnapshot(ReservationSnapshotRegistry.getInstance().popLastSnapshot(reservation.getId()));
		System.out.println("Reservation is: " + reservation);

	}
}
