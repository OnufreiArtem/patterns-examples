package org.example.visitor;

import java.time.LocalDate;

public class VacationDay<T> {
	private T employee;
	private LocalDate day;

	public VacationDay(T employee, LocalDate day) {
		this.employee = employee;
		this.day = day;
	}

	public T getEmployee() {
		return employee;
	}

	public void setEmployee(T employee) {
		this.employee = employee;
	}

	public LocalDate getDay() {
		return day;
	}

	public void setDay(LocalDate day) {
		this.day = day;
	}
}
