package org.example.singleton.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Doctor {
	private Long id;
	private String name;
	private String degree;

	public Doctor(String name, String degree) {
		this.name = name;
		this.degree = degree;
	}
}
