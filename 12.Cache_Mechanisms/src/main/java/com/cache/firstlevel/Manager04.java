package com.cache.firstlevel;

import org.hibernate.Session;

public class Manager04 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Session s2 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 2);
		Person p2 = (Person) s1.load(Person.class, 2);

		s1.beginTransaction();
		p1.setFirstName("changed1");
		s1.update(p1);
		p1.setLastName("first");
		s1.update(p1);
		s1.getTransaction().commit();
		s1.close();

		s2.beginTransaction();
		p2.setFirstName("changed3");
		s2.update(p2);
		p2.setLastName("second");
		s2.update(p2);
		s2.getTransaction().commit();
		s2.close();
		System.out.println("done done done");

	}
}

/*
 * changed and first is overrided by changed2 and secon
 * 
 */