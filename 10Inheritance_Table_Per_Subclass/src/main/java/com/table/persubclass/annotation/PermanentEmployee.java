package com.table.persubclass.annotation;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="p_employee")  
@PrimaryKeyJoinColumn(name="hid") 
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
