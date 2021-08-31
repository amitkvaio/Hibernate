package com.lara;

public class Person {
	private PersonPK pk;

	private String lastName;
	private Integer age;

	public PersonPK getPk() {
		return pk;
	}

	public void setPk(PersonPK pk) {
		this.pk = pk;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
