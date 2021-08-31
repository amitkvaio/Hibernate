package com.versioning;

import org.hibernate.Session;

public class Manager04 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 3);

		s1.beginTransaction();
		s1.delete(p1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");
	}
}
