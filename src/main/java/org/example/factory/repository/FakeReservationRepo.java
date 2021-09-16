package org.example.factory.repository;

import org.example.factory.model.Reservation;

import java.util.ArrayList;
import java.util.List;

public class FakeReservationRepo {

	private static FakeReservationRepo instance = null;

	List<Reservation> reservationList = new ArrayList<>();

	private FakeReservationRepo() {
	}

	public static FakeReservationRepo getInstance() {
		if(instance == null) {
			instance = new FakeReservationRepo();
		}

		return instance;
	}

	public void addReservation(Reservation reservation) {
		reservationList.add(reservation);
	}

	public List<Reservation> getReservationList() {
		return reservationList;
	}
}
