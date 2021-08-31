package com.lara.annotation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class Manager05 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Criteria ctr = s1.createCriteria(Person.class);

		List<Person> list = ctr.list();

		for (Person p1 : list) {
			System.out.println(p1.getId());
			System.out.println(p1.getFirstName());
			System.out.println(p1.getLastName());
			System.out.println(p1.getAge());
			System.out.println(p1.getAdd().getStreetName());
			System.out.println(p1.getAdd().getCity());
			System.out.println(p1.getAdd().getState());
			System.out.println(".............");
		}
		System.out.println("done");

	}
}
