package com.lara;

import java.util.List;

import org.hibernate.Session;

public class Manager05 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		List<Person> list = s1.createCriteria(Person.class).list();

		for (Person p1 : list) {
			System.out.println(p1.getId());
			System.out.println(p1.getFirstname());
			System.out.println(p1.getLastname());
			System.out.println(p1.getAge());
			System.out.println(".............");
		}
		System.exit(0);
	}
}
