package org.example.factory;

import org.example.factory.model.Employee;
import org.example.factory.model.Nurse;

public class NurseFactory extends EmploymentFactory{

	@Override
	public Employee createWorker(String name, String dob, String education) {
		return new Nurse(name, dob, education);
	}
}
