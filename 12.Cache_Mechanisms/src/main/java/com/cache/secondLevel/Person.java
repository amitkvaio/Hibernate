package com.cache.secondLevel;

public class Person
{
	private int id;
	private String firstName;
	private String lastName;

	private int age;

	protected int getId()
	{
		return id;
	}

	protected void setId(int id)
	{
		this.id = id;
	}

	protected String getFirstName()
	{
		return firstName;
	}

	protected void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	protected String getLastName()
	{
		return lastName;
	}

	protected void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	protected int getAge()
	{
		return age;
	}

	protected void setAge(int age)
	{
		this.age = age;
	}

}
