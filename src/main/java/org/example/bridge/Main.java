package org.example.bridge;

public class Main {

	public static void main(String[] args) {
		Test bloodTest = new BloodTest(true);
		Test ultrasoundTest = new UltrasoundTest(false);

		Report goHomeReport = new GoHomeReport(bloodTest);
		Report hospitalDirectionReport = new HospitalDirectionReport(ultrasoundTest);

		System.out.println("Go home report: ( " + goHomeReport.getReport() + " )");
		System.out.println("Hospital direction report: ( " + hospitalDirectionReport.getReport() + " )");
		
	}

}
