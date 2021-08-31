package com.lara;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = new Person();

		p1.setId(101);
		p1.setFirstname("ajit");
		p1.setLastname("kumar");
		p1.setAge(14);
		p1.setMarks(86);
		p1.setAddress("ranchi");

		Person p2 = new Person();
		p2.setId(102);
		p2.setFirstname("ankit");
		p2.setLastname("sharame");
		p2.setAge(15);
		p2.setMarks(86);
		p2.setAddress("btm");

		Person p3 = new Person();
		p3.setId(103);
		p3.setFirstname("akash");
		p3.setLastname("nepali");
		p3.setAge(15);
		p3.setMarks(80);
		p3.setAddress("bihar");

		s1.beginTransaction();
		s1.save(p1);
		s1.save(p2);
		s1.save(p3);
		s1.getTransaction().commit();

		s1.close();
		System.out.println("done");
		System.exit(0);
	}
}
