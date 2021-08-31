package com.lara.annotation;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
//@NamedNativeQueries({@NamedNativeQuery(name="q1",query="select firstName,lastName from Person")})
//@NamedNativeQueries({@NamedNativeQuery(name="q2",query="select * from  Person",resultClass=Person.class)})
//@NamedNativeQueries({@NamedNativeQuery(name="q3",query="select * from Person where age>:param1",resultClass=Person.class)})
//@NamedNativeQueries({
	//	@NamedNativeQuery(name = "q4", query = "select * from Person where age>:param1 and lastName=:param2", resultClass = Person.class) })
public class Person {
	@EmbeddedId
	private PersonPK pk;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "age")
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
