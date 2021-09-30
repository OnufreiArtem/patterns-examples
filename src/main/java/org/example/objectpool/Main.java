package org.example.objectpool;

import org.example.objectpool.model.Doctor;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.now();
		DoctorPool doctorPool = new DoctorPool();

		Doctor d1 = doctorPool.getDoctor();
		Doctor d2 = doctorPool.getDoctor();

		doctorPool.displayState();

		doctorPool.returnDoctor(d2);

		doctorPool.displayState();

		Doctor d3 = doctorPool.getDoctor();
		Doctor d4 = doctorPool.getDoctor();
		Doctor d5 = doctorPool.getDoctor();

		Doctor d6 = doctorPool.getDoctor();
		LocalDateTime finish = LocalDateTime.now();

		System.out.println("Program finished in " + ChronoUnit.MILLIS.between(start, finish));

		LocalDateTime start2 = LocalDateTime.now();
		DoctorRepository doctorRepository = new DoctorRepository();

		Doctor d7 = doctorRepository.getFreeDoctor();
		Doctor d8 = doctorRepository.getFreeDoctor();

		doctorRepository.freeDoctor(d7);

		Doctor d9 = doctorRepository.getFreeDoctor();
		Doctor d10 = doctorRepository.getFreeDoctor();
		Doctor d11 = doctorRepository.getFreeDoctor();

		Doctor d12 = doctorRepository.getFreeDoctor();
		LocalDateTime finish2 = LocalDateTime.now();

		System.out.println("Program finished in " + ChronoUnit.MILLIS.between(start2, finish2));

	}

}
