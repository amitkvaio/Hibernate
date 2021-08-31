package com.per.hierarchy.annotation;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("pm")  
public class PermanentEmployee extends Employee {
	private double salary;
	private int leavecount;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getLeavecount() {
		return leavecount;
	}

	public void setLeavecount(int leavecount) {
		this.leavecount = leavecount;
	}

}
