package org.example.bridge;

public abstract class Report {

	protected Test test;

	public Report(Test test) {
		this.test = test;
	}

	public abstract String getReport();

}
