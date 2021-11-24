package org.example.strategy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.Consumer;

public class Doctor {
	private String name;
	private String specification;

	public Doctor(String name, String specification) {
		this.name = name;
		this.specification = specification;
	}

	public void vaccinate(Patient patient, Consumer<Doctor> callback) {
		System.out.println("Doctor " + name + " vaccinates " + patient.getName());
		if (callback != null) callback.accept(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}
}
