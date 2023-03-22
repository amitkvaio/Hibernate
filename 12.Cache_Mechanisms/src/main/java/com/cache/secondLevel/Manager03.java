package com.cache.secondLevel;

import org.hibernate.Session;

public class Manager03 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Session s2 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 2);

		System.out.println(p1.getId());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getAge());

		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
		Person p2 = (Person) s2.load(Person.class, 2);
		System.out.println(p2.getId());
		System.out.println(p2.getFirstName());
		System.out.println(p2.getLastName());
		System.out.println(p2.getAge());

		System.out.println(p1 == p2);
		System.out.println(s1 == s2);
		System.out.println("done done done ");
	}
}
