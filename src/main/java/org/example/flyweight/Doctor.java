package org.example.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
	private String name;
	private String speciality;
	private LocalDate dob;
	private Map<String, String> departmentInfo;
}
