package com.save.persist;

import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = new Person();
		p1.setId(103);
		p1.setFirstname("amit");
		p1.setLastname("kumar");
		p1.setAge(24);

		Person p2 = new Person();
		p2.setId(104);
		p2.setFirstname("ajit");
		p2.setLastname("kumar");
		p2.setAge(14);

		s1.beginTransaction();
		s1.persist(p1);
		s1.persist(p2);
		s1.getTransaction().commit();
		s1.close();

		System.out.println("done");
	}
}
