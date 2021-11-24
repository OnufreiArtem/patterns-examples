package org.example.adapter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.adapter.AppliesFirstAid;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Nurse implements AppliesFirstAid {
	private Long id;
	private String name;
	private String department;

	@Override
	public void applyFirstAid() {
		System.out.println(name + " applies first aid....");
	}
}
