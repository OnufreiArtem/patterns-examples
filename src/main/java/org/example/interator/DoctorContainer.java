package org.example.interator;

import java.util.ArrayList;
import java.util.List;

public class DoctorContainer implements GenericContainer<Doctor> {

	public List<Doctor> doctorList = new ArrayList<>();
	public boolean reversed = false;

	public void setDoctorList(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}

	public void setContainerMode(boolean reversed) {
		this.reversed = reversed;
	}

	@Override
	public GenericIterator<Doctor> getIterator() {
		return reversed ? new ReverseDoctorIterator() : new DoctorIterator();
	}


	private class DoctorIterator implements GenericIterator<Doctor> {

		int currentIndex = 0;

		@Override
		public boolean hasNext() {
			return doctorList.size() > currentIndex;
		}

		@Override
		public Doctor next() {
			return doctorList.get(currentIndex++);
		}
	}

	private class ReverseDoctorIterator implements GenericIterator<Doctor> {

		int currentIndex = doctorList.size() - 1;

		@Override
		public boolean hasNext() {
			return currentIndex >= 0;
		}

		@Override
		public Doctor next() {
			return doctorList.get(currentIndex--);
		}
	}
}
