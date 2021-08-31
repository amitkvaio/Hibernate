package com.cache.secondLevel;

import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 2);

		System.out.println("11111111111111111111111");
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getId());
		System.out.println(p1.getAge());
		s1.close();

		System.out.println("222222222222222222222222");

		Session s2 = Util.getSession();
		Person p2 = (Person) s2.load(Person.class, 2);

		System.out.println(p2.getId());
		System.out.println(p2.getFirstName());
		System.out.println(p2.getLastName());
		System.out.println(p2.getAge());

		s2.close();

		System.out.println("33333333333333333333333333");

		Session s3 = Util.getSession();

		Person p3 = (Person) s3.load(Person.class, 2);

		System.out.println(p3.getId());
		System.out.println(p3.getFirstName());
		System.out.println(p3.getLastName());
		System.out.println(p3.getAge());

		s3.close();

		System.out.println("done done done done done done");

	}
}
