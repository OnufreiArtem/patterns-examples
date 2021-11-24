package org.example.factory.model;

public abstract class Employee {
	private String name;
	private String dob;
	private String education;

	public Employee(String name, String dob, String education) {
		this.name = name;
		this.dob = dob;
		this.education = education;
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", dob='" + dob + '\'' + ", education='" + education + '\'' + '}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
}
