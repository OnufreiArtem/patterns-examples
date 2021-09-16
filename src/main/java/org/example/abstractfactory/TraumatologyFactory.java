package org.example.abstractfactory;

import org.example.abstractfactory.model.DoctorTraumatologist;
import org.example.abstractfactory.model.NurseFromTraumatology;
import org.example.abstractfactory.model.Employee;

public class TraumatologyFactory extends EmploymentFactory{
	@Override
	public Employee createDoctor(String name, String dob, String education) {
		return new DoctorTraumatologist(name, dob, education);
	}

	@Override
	public Employee createNurse(String name, String dob, String education) {
		return new NurseFromTraumatology(name, dob, education);
	}
}
