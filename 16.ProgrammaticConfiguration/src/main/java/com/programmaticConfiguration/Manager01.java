package com.programmaticConfiguration;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = new Person();
		p1.setId("p101");
		p1.setFirstName("amit");
		p1.setLastName("kumar");

		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");
	}
}
