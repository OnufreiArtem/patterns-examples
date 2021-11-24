package org.example.visitor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Doctor {

	private String name;
	private String specification;
	private String room;
	private String department;
	private int salary;

	public <T> T accept(EmployeeVisitor<T> employeeVisitor) {
		return employeeVisitor.visit(this);
	}
}
