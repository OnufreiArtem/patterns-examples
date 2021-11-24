package org.example.abstractfactory;

import org.example.abstractfactory.model.Employee;

public abstract class EmploymentFactory {

	public abstract Employee createDoctor(String name, String dob, String education);
	public abstract Employee createNurse(String name, String dob, String education);

}
