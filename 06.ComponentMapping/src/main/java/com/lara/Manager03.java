package com.lara;

import org.hibernate.Session;

public class Manager03 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 2);

		System.out.println(p1.getId());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getAge());
		System.out.println("........................");
		System.out.println(p1.getAdd().getStreetName());
		System.out.println(p1.getAdd().getCity());
		System.out.println(p1.getAdd().getState());
		System.out.println(p1.getAdd().getClass().getName());
		System.out.println("........................");
		System.out.println("done");

	}
}
