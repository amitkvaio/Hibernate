package com.versioning;

import org.hibernate.Session;

public class Manager03 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 1);

		p1.setFirstname("change");
		p1.setLastname("after");

		s1.beginTransaction();
		s1.update(p1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");
	}
}
