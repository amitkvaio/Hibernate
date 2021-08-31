package com.one2one.xml.bidirectional;

public class Applicant {
	private int applicantId;
	private String name;
	private int age;
	private String city;
	private Passport passport;

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", name=" + name + ", age=" + age + ", city=" + city
				+ ", passport=" + passport + "]";
	}
}
