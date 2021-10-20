package org.example.facade;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class VacationRepository {

	List<VacationUnit> vacations = new ArrayList<>();

	public VacationRepository() {
		vacations.add(new VacationUnit("Doctor 1", LocalDateTime.now().minusDays(3), LocalDateTime.now().plusDays(4)));
		vacations.add(new VacationUnit("Doctor 2", LocalDateTime.now().plusDays(4), LocalDateTime.now().plusDays(11)));
		vacations.add(new VacationUnit("Doctor 3", LocalDateTime.now().minusDays(10), LocalDateTime.now().plusDays(17)));
	}

	public List<VacationUnit> getAllVacations() {
		return vacations;
	}



}
