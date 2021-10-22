package org.example.flyweight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Doctor> doctorList = new ArrayList<Doctor>() {{
			add(new Doctor("Doctor 1", "Speciality 1", LocalDate.now().minusYears(34), DepartmentInfo.INFECTIOUS_DISEASES_DEPARTMENT.getInfo()));
			add(new Doctor("Doctor 2", "Speciality 2", LocalDate.now().minusYears(34), DepartmentInfo.TRAUMATOLOGY_DEPARTMENT.getInfo()));
			add(new Doctor("Doctor 3", "Speciality 3", LocalDate.now().minusYears(34), DepartmentInfo.INFECTIOUS_DISEASES_DEPARTMENT.getInfo()));
			add(new Doctor("Doctor 4", "Speciality 4", LocalDate.now().minusYears(34), DepartmentInfo.TRAUMATOLOGY_DEPARTMENT.getInfo()));
		}};

		System.out.println("Doctor 1 and Doctor 3 has same department info : "
				+ (doctorList.get(0).getDepartmentInfo().hashCode() == doctorList.get(2).getDepartmentInfo().hashCode()));
		System.out.println("Doctor 1 and Doctor 2 has not same department info : "
				+ (doctorList.get(0).getDepartmentInfo().hashCode() != doctorList.get(1).getDepartmentInfo().hashCode()));
		System.out.println("Doctor 2 and Doctor 4 has same department info : "
				+ (doctorList.get(1).getDepartmentInfo().hashCode() == doctorList.get(3).getDepartmentInfo().hashCode()));
	}
}
