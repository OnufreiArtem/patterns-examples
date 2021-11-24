package org.example.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
	private String name;
	private String specification;

	public void handleReservation(Reservation reservation) throws InterruptedException {
		reservation.setState(new CurrentReservationState());
		System.out.println("Reservation status: " + reservation.getStatus());
		Thread.sleep(500);
		System.out.println("Doctor " + name + " handles reservation with patient " + reservation.getPatient().getName() + "....");
		Thread.sleep(500);
		reservation.setState(new OutdatedReservationState());
		System.out.println("Reservation status: " + reservation.getStatus());
	}
}
