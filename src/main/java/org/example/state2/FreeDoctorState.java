package org.example.state2;

public class FreeDoctorState implements DoctorState {
	@Override
	public void servePatient(Patient patient, Doctor currentDoctor) {
		System.out.println(currentDoctor.getName() + ": serves " + patient.getName());
		currentDoctor.setDoctorState(new BusyDoctorState());
		patient.setServed(true);
		currentDoctor.setDoctorState(new FreeDoctorState());
	}
}
