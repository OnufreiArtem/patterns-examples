package org.example.state2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DoctorRepository {

	private List<Doctor> doctorList = new ArrayList<>();

	private static DoctorRepository instance = new DoctorRepository();

	private DoctorRepository() {

	}

	public static DoctorRepository getInstance() {
		if (instance == null) {
			instance = new DoctorRepository();
		}
		return instance;
	}

	public void addDoctor(Doctor nDoctor) {
		doctorList.add(nDoctor);
	}

	public Doctor getFreeDoctor(Doctor requestedDoctor) {

		return doctorList.stream().filter(d -> !Objects.equals(d, requestedDoctor) && d.getDoctorState() instanceof FreeDoctorState)
				.findFirst().orElse(null);

	}


}
