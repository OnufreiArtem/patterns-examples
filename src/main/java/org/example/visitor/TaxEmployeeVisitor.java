package org.example.visitor;

public class TaxEmployeeVisitor implements EmployeeVisitor<Double> {

	@Override
	public Double visit(Doctor doctor) {
		return doctor.getSalary() * 0.1;
	}

	@Override
	public Double visit(Nurse nurse) {
		return nurse.getSalary() * 0.06;
	}

}
