package com.lara.annotation;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
//@NamedNativeQueries({@NamedNativeQuery(name="q1",query="select firstName,lastName from person")})
//@NamedNativeQueries({@NamedNativeQuery(name="q2",query="select * from person",resultClass=Person.class)})
//@NamedNativeQueries({@NamedNativeQuery(name="q3",query="select * from person where age>:param1",resultClass=Person.class)})
//@NamedNativeQueries({
	//	@NamedNativeQuery(name = "q4", query = "select * from person where age>:param1 and lastName=:param2", resultClass = Person.class) })
public class Person {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "age")
	private int age;

	@Embedded
	private Address add;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

}
