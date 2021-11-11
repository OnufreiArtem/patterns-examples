package org.example.memento;

import lombok.Data;

import java.time.LocalDateTime;

public class Reservation {
	private static Long generalId = 1L;
	private final Long id;
	private Doctor doctor;
	private Patient patient;
	private LocalDateTime date;

	public Reservation(Doctor doctor, Patient patient, LocalDateTime date) {
		this.id = generalId++;
		this.doctor = doctor;
		this.patient = patient;
		this.date = date;
	}

	public Snapshot makeSnapshot() {
		return new Snapshot(id, doctor, patient, date);
	}

	public void restoreFromSnapshot(Snapshot snapshot) {
		this.doctor = snapshot.doctor;
		this.patient = snapshot.patient;
		this.date = snapshot.date;
	}

	@Data
	public static class Snapshot {
		private final Long id;
		private final Doctor doctor;
		private final Patient patient;
		private final LocalDateTime date;
		private final LocalDateTime version;

		public Snapshot(Long id, Doctor doctor, Patient patient, LocalDateTime date) {
			this.id = id;
			this.doctor = doctor;
			this.patient = patient;
			this.date = date;
			this.version = LocalDateTime.now();
		}
	}

	@Override
	public String toString() {
		return "Reservation{" + "id=" + id + ", doctor=" + doctor + ", patient=" + patient + ", date=" + date + '}';
	}

	public Long getId() {
		return id;
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
