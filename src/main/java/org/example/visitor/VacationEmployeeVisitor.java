package org.example.visitor;

public class VacationEmployeeVisitor implements EmployeeVisitor<Integer> {

	@Override
	public Integer visit(Doctor doctor) {
		return VacationsRepository.getInstance().getFutureVacationDaysFor(doctor).size();
	}

	@Override
	public Integer visit(Nurse nurse) {
		return VacationsRepository.getInstance().getFutureVacationDaysFor(nurse).size();
	}
}
