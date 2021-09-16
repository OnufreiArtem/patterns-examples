package org.example.factory;

import org.example.factory.model.Patient;
import org.example.factory.model.Reservation;

import java.util.ArrayList;
import java.util.List;

public abstract class ReservationFactory {
	protected List<Reservation> reservations = new ArrayList<>();

	public abstract void createReservation(Patient patient);

	public abstract String peekDoctor();

	public List<Reservation> getReservations() {
		return reservations;
	};
}
