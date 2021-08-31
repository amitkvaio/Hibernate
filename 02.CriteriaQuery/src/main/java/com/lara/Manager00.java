package com.lara;

import org.hibernate.Session;

public class Manager00 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = new Person();

		p1.setFirstname("abc");
		p1.setLastname("def");
		p1.setAge(8);

		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();

		s1.close();
		System.out.println("done");
	}
}
