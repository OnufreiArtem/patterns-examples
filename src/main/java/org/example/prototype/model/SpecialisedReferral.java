package org.example.prototype.model;

public class SpecialisedReferral extends Referral {
	private String toDoctorName;
	private String toDoctorContact;

	public SpecialisedReferral() {
	}

	public SpecialisedReferral(SpecialisedReferral source) {
		super(source);
		this.toDoctorName = source.toDoctorName;
		this.toDoctorContact = source.toDoctorContact;
	}

	@Override
	public String toString() {
		return "SpecialisedReferral{" + "parent=" + super.toString() + '\'' + ", toDoctorName='" + toDoctorName + '\'' + ", toDoctorContact='" + toDoctorContact
				+ '\'' + '}';
	}

	@Override
	public Referral clone() {
		return new SpecialisedReferral(this);
	}

	public String getToDoctorName() {
		return toDoctorName;
	}

	public void setToDoctorName(String toDoctorName) {
		this.toDoctorName = toDoctorName;
	}

	public String getToDoctorContact() {
		return toDoctorContact;
	}

	public void setToDoctorContact(String toDoctorContact) {
		this.toDoctorContact = toDoctorContact;
	}
}
