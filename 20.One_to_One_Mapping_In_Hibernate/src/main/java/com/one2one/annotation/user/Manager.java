package com.one2one.annotation.user;

import org.hibernate.Session;

import util.Util;

public class Manager {
	public static void main(String[] args) {

		Session session = Util.getSession();
		UserDetails user = new UserDetails(); // create the user entity
		Vehicle vehicle = new Vehicle(); // create the vehicle entity

		vehicle.setVehicleName("BMW Car"); // set vehicle name

		user.setUserName("Amit"); // set the user name
		user.setVehicle(vehicle); 

		session.beginTransaction();// create the transaction from the session object

		session.save(vehicle); // save the vehicle entity to the database
		session.save(user); // save the user entity to the database

		session.getTransaction().commit(); // close the transaction
		session.close(); // close the session
	}
}
