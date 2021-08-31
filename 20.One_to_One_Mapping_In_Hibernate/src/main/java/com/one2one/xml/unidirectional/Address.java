package com.one2one.xml.unidirectional;

public class Address {
	private int adid;
	private String state;

	private Student student;
	/*
	 * Here the relation is one address is assigned for one student only
	 */

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getAdid() {

		return adid;
	}

	public void setAdid(int adid) {
		this.adid = adid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
