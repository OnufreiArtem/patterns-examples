package org.example.factory;

import org.example.factory.model.Patient;
import org.example.factory.model.Reservation;

import java.util.ArrayList;
import java.util.List;

public abstract class ReservationFactory {
	public abstract Reservation createReservation(Patient patient);

	public abstract String peekDoctor();
}
