package org.example.state;

public class FutureReservationState implements ReservationState {
	@Override
	public String getStatus() {
		return "Reservation is planned";
	}
}
