package org.example.builder.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Doctor {
	private Long id;
	private String name;
	private String surname;
	private String speciality;
	private LocalDate dateOfBirth;
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;


	public Doctor() {
		createdAt = LocalDateTime.now();
		modifiedAt = LocalDateTime.now();
	}

	public Doctor(Long id, String name, String surname, String speciality, LocalDate dateOfBirth, LocalDateTime createdAt, LocalDateTime modifiedAt) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.speciality = speciality;
		this.dateOfBirth = dateOfBirth;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

	public static DoctorBuilder builder() {
		return new DoctorBuilder();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(LocalDateTime modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	@Override
	public String toString() {
		return "Doctor{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", speciality='" + speciality + '\'' + ", dateOfBirth="
				+ dateOfBirth + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + '}';
	}

	public static class DoctorBuilder {
		private Long id;
		private String name;
		private String surname;
		private String speciality;
		private LocalDate dateOfBirth;
		private LocalDateTime createdAt;
		private LocalDateTime modifiedAt;

		public DoctorBuilder() {
			createdAt = LocalDateTime.now();
			modifiedAt = LocalDateTime.now();
		}

		public Doctor build() {
			return new Doctor(id, name, surname, speciality, dateOfBirth, createdAt, modifiedAt);
		}

		public DoctorBuilder setId(Long id) {
			this.id = id;
			return this;
		}

		public DoctorBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public DoctorBuilder setSurname(String surname) {
			this.surname = surname;
			return this;
		}

		public DoctorBuilder setSpeciality(String speciality) {
			this.speciality = speciality;
			return this;
		}

		public DoctorBuilder setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}

		public DoctorBuilder setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
			return this;
		}

		public DoctorBuilder setModifiedAt(LocalDateTime modifiedAt) {
			this.modifiedAt = modifiedAt;
			return this;
		}
	}

}
