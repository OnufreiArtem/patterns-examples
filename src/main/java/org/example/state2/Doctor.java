package org.example.state2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {

	private String name;
	private String speciality;
	private DoctorState doctorState;

	public void serve(Patient patient) {
		doctorState.servePatient(patient, this);
	}

}
