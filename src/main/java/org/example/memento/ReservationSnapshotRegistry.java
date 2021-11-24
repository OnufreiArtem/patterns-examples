package org.example.memento;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class ReservationSnapshotRegistry {
	private List<Reservation.Snapshot> reservationList = new ArrayList<>();

	private static ReservationSnapshotRegistry instance = new ReservationSnapshotRegistry();

	private ReservationSnapshotRegistry() {

	}

	public Reservation.Snapshot popLastSnapshot(Long id) {
		Reservation.Snapshot snapshot = reservationList.stream().filter(s -> Objects.equals(s.getId(), id))
				.max(Comparator.comparing(Reservation.Snapshot::getVersion)).orElse(null);

		if (snapshot != null) {
			reservationList.remove(snapshot);
			return snapshot;
		}

		throw new RuntimeException("No snapshot found with id=" + id);

	}

	public void saveSnapshot(Reservation.Snapshot snapshot) {
		reservationList.add(snapshot);
	}

	public static ReservationSnapshotRegistry getInstance() {
		return instance;
	}
}
