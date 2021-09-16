package org.example.factory;

import org.example.factory.model.Patient;
import org.example.factory.model.Reservation;
import org.example.factory.repository.FakeReservationRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MaternityDepFactory extends ReservationFactory {

	private final List<String> doctorNames = new ArrayList<>(
			Arrays.asList(
					"Maternity doctor 1",
					"Maternity doctor 2",
					"Maternity doctor 3",
					"Maternity doctor 4",
					"Maternity doctor 5",
					"Maternity doctor 6"
			)
	);

	@Override
	public Reservation createReservation(Patient patient) {
		return new Reservation("Maternity Department", peekDoctor(), patient);
	}

	@Override
	public String peekDoctor() {
		return doctorNames.get(new Random().nextInt(doctorNames.size()));
	}
}
