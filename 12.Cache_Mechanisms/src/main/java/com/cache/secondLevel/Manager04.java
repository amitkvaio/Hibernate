package com.cache.secondLevel;

import org.hibernate.Session;

public class Manager04 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 1);

		System.out.println(p1.getId());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getAge());

		System.out.println("=====1=====");

		// s1.evict(p1);
		s1.clear();

		System.out.println(p1.getId());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getAge());

		System.out.println("======2=========");

		Person p2 = (Person) s1.load(Person.class, 1);
		System.out.println(p2.getId());
		System.out.println(p2.getFirstName());

		System.out.println("=============3==============");

		Person p3 = (Person) s1.load(Person.class, 1);
		System.out.println(p3.getId());
		System.out.println(p3.getFirstName());

	}
}
