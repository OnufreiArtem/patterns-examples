package org.example.proxy;

import java.util.ArrayList;
import java.util.List;

public class PatientRepository {

	private final List<Patient> patientList;

	private static PatientRepository instance;

	private PatientRepository() {
		this.patientList = new ArrayList<Patient>() {{
			add(new Patient("Patient 1"));
			add(new Patient("Patient 2"));
			add(new Patient("Patient 3"));
		}};
	}

	public static PatientRepository getInstance() {
		if (instance == null) {
			instance = new PatientRepository();
		}
		return instance;
	}

	public List<Patient> getAllPatients() {
		return patientList;
	}

	public boolean exists(String patientName) {
		return patientList.stream().anyMatch(it -> it.getName().equals(patientName));
	}

	public void addPatient(Patient p) {
		patientList.add(p);
	}
}
