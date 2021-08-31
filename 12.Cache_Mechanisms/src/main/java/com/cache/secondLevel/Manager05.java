package com.cache.secondLevel;

import org.hibernate.Session;

public class Manager05 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Session s2 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 1);
		Person p2 = (Person) s2.load(Person.class, 1);

		System.out.println(p1.getId());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getAge());

		System.out.println("=============");
		System.out.println(p2.getId());
		System.out.println(p2.getFirstName());
		System.out.println(p2.getLastName());
		System.out.println(p2.getAge());

		s1.close();
		s2.close();
		System.out.println("done");
	}
}
