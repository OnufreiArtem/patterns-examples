package org.example.composite.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor implements HasSalary {
	private String name;
	private String specification;
	private LocalDate dob;
	private int salary;

	@Override
	public int getSalary() {
		return salary;
	}
}
