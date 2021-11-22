package org.example.state2;

public class BusyDoctorState implements DoctorState {
	@Override
	public void servePatient(Patient patient, Doctor currentDoctor) {
		System.out.println("This doctor is busy now. Please, contact with other doctor");
	}
}
