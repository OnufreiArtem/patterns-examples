package org.example.bridge;

public class UltrasoundTest implements Test{

	private final Boolean isOk;

	public UltrasoundTest(Boolean isOk) {
		this.isOk = isOk;
	}

	@Override
	public String getResults() {
		return "Ultrasound test: Everything is " + (isOk ? "good" : "bad");
	}
}
