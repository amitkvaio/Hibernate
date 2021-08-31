package com.merge.update;

import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 1);// lazy loading
		System.out.println(p1.getId());
		System.out.println(p1.getFirstname());
		System.out.println("===========================");

		Session s2 = HibernateUtil.currentSession();
		Person p2 = (Person) s2.get(Person.class, 1);// eager loading
		System.out.println(p2.getId());
		System.out.println(p2.getFirstname());

	}
}
