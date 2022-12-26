package com.lara;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;

@Entity
@Table(name="Person")

@NamedNativeQueries({
					@NamedNativeQuery(name="q1",query="select * from Person",resultClass=Person.class),
					@NamedNativeQuery(name="q2",query="select * from Person where Age>:param1",resultClass=Person.class),
					@NamedNativeQuery(name="q3",query="select * from Person where Age>:param1 and lastname=:param2",resultClass=Person.class),
					@NamedNativeQuery(name="q4", query = "select id,firstname,lastname, age, address, marks from Person", resultClass=Person.class )
})

public class Person {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "age")
	private int age;

	@Column(name = "address")
	private String address;

	@Column(name = "marks")
	private int marks;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}
