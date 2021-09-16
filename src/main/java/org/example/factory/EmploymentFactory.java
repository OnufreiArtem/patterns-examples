package org.example.factory;

import org.example.factory.model.Employee;

public abstract class EmploymentFactory {

	public abstract Employee createWorker(String name, String dob, String education);

}
