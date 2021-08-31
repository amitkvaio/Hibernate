package com.cache.firstlevel;

import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 1);

		System.out.println("11111111111111111111111");
		System.out.println(p1.getId());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getAge());

		Person p2 = (Person) s1.load(Person.class, 1);
		System.out.println("222222222222222222222222");
		System.out.println(p2.getId());
		System.out.println(p2.getFirstName());
		System.out.println(p2.getLastName());
		System.out.println(p2.getAge());

		Person p3 = (Person) s1.load(Person.class, 1);
		System.out.println("33333333333333333333333333");
		System.out.println(p3.getId());
		System.out.println(p3.getFirstName());
		System.out.println(p3.getLastName());
		System.out.println(p3.getAge());

		Person p4 = (Person) s1.load(Person.class, 1);
		System.out.println("444444444444444444444444444");
		System.out.println(p4.getId());
		System.out.println(p4.getFirstName());
		System.out.println(p4.getLastName());
		System.out.println(p4.getAge());
		System.out.println("session close session close:");

		s1.close();
		// we close the first session, so the cache memory related this session also
		// will be destroyed

		Session s2 = Util.getSession();
		Person p5 = (Person) s2.load(Person.class, 1);
		System.out.println(p5.getId());
		System.out.println(p5.getFirstName());
		System.out.println(p5.getLastName());
		System.out.println(p5.getAge());
		System.out.println("done done done done done done");
	}
}
