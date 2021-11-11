package org.example.state;

import java.time.LocalDateTime;

public class Reservation {
	private Doctor doctor;
	private Patient patient;
	private LocalDateTime date;
	private ReservationState state;

	public Reservation(Doctor doctor, Patient patient, LocalDateTime date, ReservationState state) {
		this.doctor = doctor;
		this.patient = patient;
		this.date = date;
		this.state = state;
	}

	public String getStatus() {
		return state.getStatus();
	}

	public ReservationState getState() {
		return state;
	}

	public void setState(ReservationState state) {
		this.state = state;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
}
