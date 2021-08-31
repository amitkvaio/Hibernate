package com.lara;

import org.hibernate.Session;

public class Manager07 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 3);

		p1.setAddress("patna");
		p1.setAge(100);
		p1.setLastname("sharam");
		s1.beginTransaction();
		s1.update(p1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");
		System.exit(0);
	}
}
