package org.example.bridge;

public class BloodTest implements Test {

	private final Boolean isOk;

	public BloodTest(Boolean isOk) {
		this.isOk = isOk;
	}

	@Override
	public String getResults() {
		return "Blood test: Everything is " + (isOk ? "good" : "bad");
	}
}
