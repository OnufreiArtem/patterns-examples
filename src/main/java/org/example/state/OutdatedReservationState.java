package org.example.state;

public class OutdatedReservationState implements ReservationState {
	@Override
	public String getStatus() {
		return "This reservation is outdated";
	}
}
