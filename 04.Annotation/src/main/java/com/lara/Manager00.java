package com.lara;

import org.hibernate.Session;

public class Manager00 {
	public static void main(String[] args) {

		Session s1 = Util.getSession();
		Person p1 = new Person();

		p1.setFirstname("lara");
		p1.setLastname("rst");
		p1.setAddress("btm");
		p1.setMarks(101);
		p1.setAge(25);

		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");
		System.exit(0);
	}
}
