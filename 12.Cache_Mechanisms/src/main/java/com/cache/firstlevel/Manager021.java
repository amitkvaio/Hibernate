package com.cache.firstlevel;

import org.hibernate.Session;

public class Manager021 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 1);

		System.out.println("11111111111111111111111");
		System.out.println(p1.getId());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getAge());

		s1.evict(p1);

		Person p2 = (Person) s1.load(Person.class, 1);

		System.out.println("222222222222222222222222");
		System.out.println(p2.getId());
		System.out.println(p2.getFirstName());
		System.out.println(p2.getLastName());
		System.out.println(p2.getAge());

		s1.evict(p2);

		Person p3 = (Person) s1.load(Person.class, 1);

		System.out.println("33333333333333333333333333");
		System.out.println(p3.getId());
		System.out.println(p3.getFirstName());
		System.out.println(p3.getLastName());
		System.out.println(p3.getAge());

		s1.evict(p3);

		Person p4 = (Person) s1.load(Person.class, 1);

		System.out.println("444444444444444444444444444");
		System.out.println(p4.getId());
		System.out.println(p4.getFirstName());
		System.out.println(p4.getLastName());
		System.out.println(p4.getAge());
		System.out.println("session close session close:");

		s1.evict(p4);

		System.out.println("done done done done done done");

		// evice() is used to remove a particular object from the cache memory

	}
}
