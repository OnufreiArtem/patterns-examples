package org.example.bridge;

public class HospitalDirectionReport extends Report {

	public HospitalDirectionReport(Test test) {
		super(test);
	}

	@Override
	public String getReport() {
		return "According to the test: [" + test.getResults() + "] you need to stay at the hospital.";
	}
}
