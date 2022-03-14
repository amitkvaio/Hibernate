package com.lara;

import org.hibernate.Session;

public class Manager00 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Raja p1 = new Raja();

		p1.setFirstname("Manoj");
		p1.setLastname("Sasmal");
		p1.setAge(25);

		Raja p2 = new Raja();
		p2.setFirstname("Malik");
		p2.setLastname("Arjun");
		p2.setAge(24);

		s1.beginTransaction();
		s1.save(p1);
		s1.save(p2);
		s1.getTransaction().commit();

		s1.close();
		System.out.println("done");
		System.exit(0);
	}
}
