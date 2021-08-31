package com.lara.annotation;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class Manager10 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		List<Object[]> list1 = s1.getNamedQuery("q1").list();

		Criteria ctr = s1.createCriteria(Person.class);

		for (Object[] p1 : list1) {
			System.out.println(Arrays.toString(p1));
		}

		System.out.println("...............");
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

	}
}
