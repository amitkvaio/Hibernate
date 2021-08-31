package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class Manager09 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Criteria ctr = s1.createCriteria(Person.class);

		List<Person> list = ctr.list();

		for (Person p1 : list) {
			System.out.println(p1.getId());
			System.out.println(p1.getFirstname());
			System.out.println(p1.getLastname());
			System.out.println(p1.getAge());
			System.out.println(p1.getAddress());
			System.out.println(p1.getMarks());
			System.out.println(p1.getClass());
			System.out.println("...............");
		}
		System.exit(0);
	}
}
