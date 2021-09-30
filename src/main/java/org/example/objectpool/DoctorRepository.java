package org.example.objectpool;

import org.example.objectpool.model.Doctor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoctorRepository {

	public static List<Doctor> doctorList = new ArrayList<>();
	public static Map<Doctor, Boolean> availability = new HashMap<>();

	public DoctorRepository() {
		doctorList.forEach(it -> availability.put(it, true));
	}

	public Doctor getFreeDoctor() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Doctor doctor = availability.entrySet().stream().filter(it -> it.getValue().equals(true)).map(Map.Entry::getKey).findFirst().orElse(null);
		if (doctor == null) {
			System.out.println("No doctors available now");
			return null;
		}
		System.out.println(doctor + " is busy now");
		availability.put(doctor, false);
		return doctor;
	}

	public void freeDoctor(Doctor doctor) {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		availability.put(doctor, true);
		System.out.println(doctor + " is free now");
	}

	static {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		doctorList.add(Doctor.builder().Id(1L).name("Doctor 1").speciality("Traumatologist").build());
		doctorList.add(Doctor.builder().Id(2L).name("Doctor 2").speciality("Traumatologist").build());
		doctorList.add(Doctor.builder().Id(3L).name("Doctor 3").speciality("Traumatologist").build());
		doctorList.add(Doctor.builder().Id(4L).name("Doctor 4").speciality("Traumatologist").build());
	}


}
