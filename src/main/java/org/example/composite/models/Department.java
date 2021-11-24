package org.example.composite.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements HasSalary {

	private String name;
	private List<HasSalary> employees;

	@Override
	public int getSalary() {
		return employees.stream().map(HasSalary::getSalary).reduce(Integer::sum).orElse(0);
	}

	public Department addEmployee(HasSalary employee) {
		employees.add(employee);
		return this;
	}
}
