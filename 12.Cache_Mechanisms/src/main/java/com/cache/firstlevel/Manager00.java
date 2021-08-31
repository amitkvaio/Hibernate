package com.cache.firstlevel;

import org.hibernate.Session;

public class Manager00 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = new Person();
		p1.setFirstName("sony");
		p1.setLastName("vaio");
		p1.setAge(19);

		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("Done");
	}
}
