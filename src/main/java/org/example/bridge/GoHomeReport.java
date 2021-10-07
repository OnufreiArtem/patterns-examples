package org.example.bridge;

public class GoHomeReport extends Report {

	public GoHomeReport(Test test) {
		super(test);
	}

	@Override
	public String getReport() {
		return "According to the test: [" + test.getResults() + "] you can go home.";
	}
}
