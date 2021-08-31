package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager12 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Query qr = s1.createQuery("from com.lara.Person where FIRSTNAME='amit'");

		List<Person> list = qr.list();

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
