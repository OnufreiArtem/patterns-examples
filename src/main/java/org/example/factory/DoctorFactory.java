package org.example.factory;

import org.example.factory.model.Doctor;
import org.example.factory.model.Employee;

public class DoctorFactory extends EmploymentFactory{
	@Override
	public Employee createWorker(String name, String dob, String education) {
		return new Doctor(name, dob, education);
	}
}
