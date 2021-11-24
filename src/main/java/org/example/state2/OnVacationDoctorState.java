package org.example.state2;

public class OnVacationDoctorState implements DoctorState {
	@Override
	public void servePatient(Patient patient, Doctor currentDoctor) {
		System.out.println("This doctor is on the vacation now, sending patient to other doctor...");
		Doctor nDoctor = DoctorRepository.getInstance().getFreeDoctor(currentDoctor);
		if (nDoctor == null) {
			System.out.println("No free doctors was found");
		} else {
			nDoctor.serve(patient);
		}
	}
}
