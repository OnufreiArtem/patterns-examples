package org.example.interator;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		DoctorContainer doctorContainer = new DoctorContainer();
		doctorContainer.setDoctorList(new ArrayList<Doctor>() {{
			add(new Doctor("Doctor 1", "Specification 1"));
			add(new Doctor("Doctor 2", "Specification 2"));
			add(new Doctor("Doctor 3", "Specification 3"));
			add(new Doctor("Doctor 4", "Specification 4"));
		}});

		System.out.println("Original order:");
		GenericIterator<Doctor> iterator = doctorContainer.getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\n\nReversed order:");
		doctorContainer.setContainerMode(true);
		GenericIterator<Doctor> reversedIterator = doctorContainer.getIterator();
		while (reversedIterator.hasNext()) {
			System.out.println(reversedIterator.next());
		}
	}

}
