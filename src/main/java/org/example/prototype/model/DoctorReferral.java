package org.example.prototype.model;

public class DoctorReferral extends Referral{
	private String fromDoctorName;
	private String fromDoctorContact;

	public DoctorReferral() {
	}

	public DoctorReferral(DoctorReferral doctorReferral) {
		super(doctorReferral);
		this.fromDoctorName = doctorReferral.fromDoctorName;
		this.fromDoctorContact = doctorReferral.fromDoctorContact;
	}

	@Override
	public String toString() {
		return "DoctorReferral{" + "parent=" + super.toString() + '\'' + ", fromDoctorName='" + fromDoctorName + '\'' + ", fromDoctorContact='"
				+ fromDoctorContact + '\'' + '}';
	}

	@Override
	public Referral clone() {
		return new DoctorReferral(this);
	}

	public String getFromDoctorName() {
		return fromDoctorName;
	}

	public void setFromDoctorName(String fromDoctorName) {
		this.fromDoctorName = fromDoctorName;
	}

	public String getFromDoctorContact() {
		return fromDoctorContact;
	}

	public void setFromDoctorContact(String fromDoctorContact) {
		this.fromDoctorContact = fromDoctorContact;
	}
}
