package org.example.prototype.model;


public abstract class Referral {
	private String fromMedicalCenter;
	private String fromMedicalCenterAddress;
	private String toMedicalCenter;
	private String cause;
	private String category;
	private String patientName;
	private String patientDob;
	private String date;

	public Referral() {
	}

	public Referral(Referral referral) {
		this.fromMedicalCenter = referral.fromMedicalCenter;
		this.fromMedicalCenterAddress = referral.fromMedicalCenterAddress;
		this.toMedicalCenter = referral.toMedicalCenter;
		this.cause = referral.cause;
		this.category = referral.category;
		this.patientName = referral.patientName;
		this.patientDob = referral.patientDob;
		this.date = referral.date;
	}

	@Override
	public String toString() {
		return "Referral{" + "fromMedicalCenter='" + fromMedicalCenter + '\'' + ", fromMedicalCenterAddress='" + fromMedicalCenterAddress + '\''
				+ ", toMedicalCenter='" + toMedicalCenter + '\'' + ", cause='" + cause + '\'' + ", category='" + category + '\'' + ", patientName='"
				+ patientName + '\'' + ", patientDob='" + patientDob + '\'' + ", date='" + date + '\'' + '}';
	}

	public abstract Referral clone();

	public String getFromMedicalCenter() {
		return fromMedicalCenter;
	}

	public void setFromMedicalCenter(String fromMedicalCenter) {
		this.fromMedicalCenter = fromMedicalCenter;
	}

	public String getFromMedicalCenterAddress() {
		return fromMedicalCenterAddress;
	}

	public void setFromMedicalCenterAddress(String fromMedicalCenterAddress) {
		this.fromMedicalCenterAddress = fromMedicalCenterAddress;
	}

	public String getToMedicalCenter() {
		return toMedicalCenter;
	}

	public void setToMedicalCenter(String toMedicalCenter) {
		this.toMedicalCenter = toMedicalCenter;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientDob() {
		return patientDob;
	}

	public void setPatientDob(String patientDob) {
		this.patientDob = patientDob;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
