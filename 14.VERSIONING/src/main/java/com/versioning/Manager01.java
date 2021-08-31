package com.versioning;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = new Person();

		p1.setFirstname("amit");
		p1.setLastname("kumar");

		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");
	}
}
