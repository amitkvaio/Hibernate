package com.lara.annotation;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Address a1 = new Address();

		a1.setStreetName("btm");
		a1.setCity("bangalore");
		a1.setState("karnataka");

		Person p1 = new Person();

		p1.setFirstName("amit");
		p1.setLastName("kumar");
		p1.setAge(24);
		p1.setAdd(a1);

		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");

	}
}
