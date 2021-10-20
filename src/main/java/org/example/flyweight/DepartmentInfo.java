package org.example.flyweight;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public enum DepartmentInfo {
	INFECTIOUS_DISEASES_DEPARTMENT(new HashMap<String, String>() {{
		put("name", "Infectious diseases department");
		put("address", "Some Street 1");
		put("chief physician", "Doctor 111");
		put("foundation", LocalDate.now().minusYears(20).toString());
	}}),
	TRAUMATOLOGY_DEPARTMENT(new HashMap<String, String>() {{
		put("name", "Infectious diseases department");
		put("address", "Some Street 1");
		put("chief physician", "Doctor 1");
		put("foundation", LocalDate.now().minusYears(20).toString());
	}});

	private final Map<String, String> map;

	DepartmentInfo(Map<String, String> info) {
		this.map = info;
	}
	public Map<String, String> getInfo() {
		return map;
	}
}
