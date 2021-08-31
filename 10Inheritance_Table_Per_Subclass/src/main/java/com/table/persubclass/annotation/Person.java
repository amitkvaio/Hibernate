package com.table.persubclass.annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="Person")  
@PrimaryKeyJoinColumn(name="hid")  
public class Person extends Human {
	
	@Column
	private String address;
	@Column
	private String city;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
