package com.lara;

import org.hibernate.Session;

public class Manager06 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 1);
		System.out.println(p1.getId());
		System.out.println(p1.getFirstname());
		System.out.println(p1.getLastname());
		System.out.println(p1.getAge());
		System.out.println(p1.getAddress());
		System.out.println(p1.getMarks());
		System.out.println(p1.getClass());
		System.exit(0);
	}
}
