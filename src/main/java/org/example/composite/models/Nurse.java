package org.example.composite.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nurse implements HasSalary {
	private String name;
	private LocalDate dob;
	private int salary;

	@Override
	public int getSalary() {
		return salary;
	}
}
