package com.concrete.annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PermanentEmployee")

public class PermanentEmployee extends Employee
{
	@Column(name="salary")
	private double salary;
	
	@Column(name="leavecount")
	private int leavecount;
	
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public int getLeavecount()
	{
		return leavecount;
	}
	public void setLeavecount(int leavecount)
	{
		this.leavecount = leavecount;
	}
	
	
}
