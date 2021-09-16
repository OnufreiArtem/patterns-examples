package org.example.factory;

import org.example.factory.model.Patient;
import org.example.factory.model.Reservation;
import org.example.factory.repository.FakeReservationRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ResuscitationDepFactory extends ReservationFactory {

	private final List<String> doctorNames = new ArrayList<>(
			Arrays.asList(
					"Resuscitation doctor 1",
					"Resuscitation doctor 2",
					"Resuscitation doctor 3",
					"Resuscitation doctor 4",
					"Resuscitation doctor 5",
					"Resuscitation doctor 6"
			)
	);

	@Override
	public Reservation createReservation(Patient patient) {
		return new Reservation("Resuscitation Department", peekDoctor(), patient);
	}

	@Override
	public String peekDoctor() {
		return doctorNames.get(new Random().nextInt(doctorNames.size()));
	}

}
