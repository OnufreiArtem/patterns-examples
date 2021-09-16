package org.example.prototype;

import org.example.prototype.model.DoctorReferral;
import org.example.prototype.model.SpecialisedReferral;

public class Main {

	public static void main(String[] args) {

		DoctorReferral doctorReferralTemplate = new DoctorReferral();
		doctorReferralTemplate.setFromMedicalCenter("Новоселицька районна лікарня");
		doctorReferralTemplate.setFromMedicalCenterAddress("місто Новоселиця");
		doctorReferralTemplate.setFromDoctorName("Doctor 1");
		doctorReferralTemplate.setFromDoctorContact("+123123123123");

		SpecialisedReferral specialisedReferralTemplate = new SpecialisedReferral();
		specialisedReferralTemplate.setFromMedicalCenter("Новоселицька районна лікарня");
		specialisedReferralTemplate.setFromMedicalCenterAddress("місто Новоселиця");
		specialisedReferralTemplate.setToDoctorName("Doctor 2");
		specialisedReferralTemplate.setToDoctorContact("+1231231231231");


		DoctorReferral nDoctorReferral = (DoctorReferral) doctorReferralTemplate.clone();
		nDoctorReferral.setCause("Some problem to investigate");
		nDoctorReferral.setToMedicalCenter("Somewhere");

		SpecialisedReferral nSpecialisedReferral = (SpecialisedReferral) specialisedReferralTemplate.clone();
		nSpecialisedReferral.setCause("Some very important problem to investigate");
		nSpecialisedReferral.setToMedicalCenter("Somewhere");

		System.out.println(nDoctorReferral);
		System.out.println(nSpecialisedReferral);
	}
}
