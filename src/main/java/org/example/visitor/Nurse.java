package org.example.visitor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Nurse {

	public String name;
	public String department;
	public int salary;

	public <T> T accept(EmployeeVisitor<T> employeeVisitor) {
		return employeeVisitor.visit(this);
	}

}
