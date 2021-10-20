package org.example.facade;

import java.time.LocalDateTime;
import java.util.Objects;

public class ReservationService {

	private final VacationRepository vacationRepository;
	private final ReservationRepository reservationRepository;

	public ReservationService(VacationRepository vacationRepository, ReservationRepository reservationRepository) {
		this.vacationRepository = vacationRepository;
		this.reservationRepository = reservationRepository;
	}

	public boolean registerReservation(String patientName, String doctorName, LocalDateTime reservationDate) {
		System.out.println("Attempt to create reservation for " + patientName);
		if (validateReservationDate(doctorName, reservationDate)) {
			reservationRepository.addReservation(new Reservation(patientName, doctorName, reservationDate));
			return true;
		}

		return false;
	}

	public boolean validateReservationDate(String doctorName, LocalDateTime reservationTime) {

		boolean vacationStatus = vacationRepository.getAllVacations().stream().filter(it -> Objects.equals(it.getEmployeeName(), doctorName))
				.noneMatch(it -> it.getStart().isBefore(reservationTime) && it.getEnd().isAfter(reservationTime));

		if (!vacationStatus) {
			System.out.println("Error: Doctor has the vacation at this time");
			return false;
		}

		if (reservationRepository.getAllReservations().stream().filter(it -> Objects.equals(it.getDoctor(), doctorName))
				.anyMatch(it -> it.getTimeOfReservation().isEqual(reservationTime))) {
			System.out.println("Error: Doctor has other reservation at this time");
			return false;
		}

		return true;
	}

	public ReservationRepository getReservationRepository() {
		return reservationRepository;
	}

	public VacationRepository getVacationRepository() {
		return vacationRepository;
	}
}
