package com.one2one.xml.bidirectional;

import org.hibernate.Session;

import util.Util;

public class Manager03 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 102);

		System.out.println("Person Information:");
		System.out.println(p1.getId());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getAge());

		System.out.println("Person Address");
		System.out.println(p1.getAddress().getId());
		System.out.println(p1.getAddress().getHouseNo());
		System.out.println(p1.getAddress().getStreetName());
		System.out.println(p1.getAddress().getState());

		System.out.println("-------------------------");
		Address a1 = (Address) s1.load(Address.class, 105);
		System.out.println(a1.getId());
		System.out.println(a1.getHouseNo());
		System.out.println(a1.getStreetName());
		System.out.println(a1.getState());

		System.out.println(a1.getPerson().getId());
		System.out.println(a1.getPerson().getFirstName());
		System.out.println(a1.getPerson().getLastName());
		System.out.println(a1.getPerson().getAge());
	}
}
