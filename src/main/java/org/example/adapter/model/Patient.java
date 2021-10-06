package org.example.adapter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Patient {
	private Long id;
	private String name;
	private String problem;

	public void getFirstAid(Nurse nurse) {
		nurse.applyFirstAid();
	}

}
