package org.example.state;

public class CurrentReservationState implements ReservationState {
	@Override
	public String getStatus() {
		return "Reservation is now in progress";
	}
}
