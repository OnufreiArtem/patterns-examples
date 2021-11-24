package org.example.visitor;

public interface EmployeeVisitor<T> {

	T visit(Doctor doctor);

	T visit(Nurse nurse);

}
