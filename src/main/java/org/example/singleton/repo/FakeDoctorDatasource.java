package org.example.singleton.repo;

import org.example.singleton.model.Doctor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FakeDoctorDatasource implements CRUDRepo<Doctor> {

	private List<Doctor> doctorDatabase = new ArrayList<>();
	private static long id = 0L;

	private static volatile FakeDoctorDatasource instance = null;

	private FakeDoctorDatasource() {
		initFakeData();
	}

	public static FakeDoctorDatasource getInstance() {
		if (instance != null) {
			return instance;
		}

		synchronized (FakeDoctorDatasource.class) {
			instance = new FakeDoctorDatasource();
			return instance;
		}
	}

	private void initFakeData() {
		this.addMany(
				new Doctor(id++, "Scarlett Johansson", "PH"),
				new Doctor(id++, "Elizabeth Olsen", "PH"),
				new Doctor(id++, "Robert Downey Jr", "PH"),
				new Doctor(id++, "Benedict Cumberbatch", "PH"),
				new Doctor(id++, "Tom Holland", "PH")
		);
	}

	@Override
	public void add(Doctor item) {
		item.setId(id++);
		doctorDatabase.add(item);
	}

	@Override
	public void addMany(Doctor... list) {
		for (Doctor doctor : list) {
			add(doctor);
		}
	}

	@Override
	public void update(Doctor item) {
		doctorDatabase = doctorDatabase.stream().map(it -> Objects.equals(it.getId(), item.getId()) ? item : it).collect(Collectors.toList());
	}

	@Override
	public void remove(Long id) {
		doctorDatabase = doctorDatabase.stream().filter(it -> !Objects.equals(it.getId(), id)).collect(Collectors.toList());
	}

	@Override
	public Doctor get(Long id) {
		return doctorDatabase.stream().filter(it -> Objects.equals(it.getId(), id)).findFirst().orElse(null);
	}

	@Override
	public List<Doctor> getAll() {
		return doctorDatabase;
	}
}
