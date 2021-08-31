package com.merge.update;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = new Person();

		p1.setFirstname("amit");
		p1.setLastname("kumar");
		p1.setAge(24);

		Person p2 = new Person();
		p2.setFirstname("ajit");
		p2.setLastname("kumar");
		p2.setAge(14);

		s1.beginTransaction();
		s1.save(p1);
		s1.save(p2);
		s1.getTransaction().commit();
		s1.close();

		System.out.println("done");
	}
}