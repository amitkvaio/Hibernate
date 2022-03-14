package com.lara;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column(name = "Customer_Name")
	String customerName;

	@Column(name = "email")
	String email;

	public Customer() {
		super();
	}

	public Customer(String customerName, String email) {
		super();
		this.customerName = customerName;
		this.email = email;
	}
	//Develop setter and getter method
}
