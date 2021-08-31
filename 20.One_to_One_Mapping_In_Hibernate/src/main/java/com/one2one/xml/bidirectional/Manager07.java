package com.one2one.xml.bidirectional;

import java.util.List;

import org.hibernate.Session;

import util.Util;

public class Manager07 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		List<Person> list = s1.createCriteria(Person.class).list();

		for (Person p1 : list) {
			System.out.println(p1.getId());
			System.out.println(p1.getFirstName());
			System.out.println(p1.getLastName());
			System.out.println(p1.getAge());

			System.out.println(p1.getAddress().getHouseNo());
			System.out.println(p1.getAddress().getStreetName());
			System.out.println(p1.getAddress().getState());
			System.out.println("................................");
		}
		System.out.println("done");
	}
}
