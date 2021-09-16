package org.example.abstractfactory;

import org.example.abstractfactory.model.DoctorAccoucheur;
import org.example.abstractfactory.model.NurseFromMaternityWard;
import org.example.abstractfactory.model.Employee;

public class MaternityFactory extends EmploymentFactory{

	@Override
	public Employee createDoctor(String name, String dob, String education) {
		return new DoctorAccoucheur(name, dob, education);
	}

	@Override
	public Employee createNurse(String name, String dob, String education) {
		return new NurseFromMaternityWard(name, dob, education);
	}
}
