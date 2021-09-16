package org.example.factory;

import org.example.factory.model.Patient;
import org.example.factory.model.Reservation;
import org.example.factory.repository.FakeReservationRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class InfectiousDiseasesDepFactory extends ReservationFactory{

	private final List<String> doctorNames = new ArrayList<>(
			Arrays.asList(
					"Infectious Diseases doctor 1",
					"Infectious Diseases doctor 2",
					"Infectious Diseases doctor 3",
					"Infectious Diseases doctor 4",
					"Infectious Diseases doctor 5",
					"Infectious Diseases doctor 6"
			)
	);

	@Override
	public Reservation createReservation(Patient patient) {
		return new Reservation("Infectious Diseases Department", peekDoctor(), patient);
	}

	@Override
	public String peekDoctor() {
		return doctorNames.get(new Random().nextInt(doctorNames.size()));
	}

}
