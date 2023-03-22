package com.versioning;

public class Person {
	private int id;
	private String firstname;
	private String lastname;

	private int ver;

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getFirstname() {
		return firstname;
	}

	protected void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	protected String getLastname() {
		return lastname;
	}

	protected void setLastname(String lastname) {
		this.lastname = lastname;
	}

	protected int getVer() {
		return ver;
	}

	protected void setVer(int ver) {
		this.ver = ver;
	}

}
