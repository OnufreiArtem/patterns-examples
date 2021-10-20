package org.example.composite.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Institution {
	private String name;
	private List<Department> departments;

	public int getFullSalary() {
		return departments.stream().map(Department::getSalary).reduce(Integer::sum).orElse(0);
	}

	public Institution addDepartment(Department department) {
		departments.add(department);
		return this;
	}

}
