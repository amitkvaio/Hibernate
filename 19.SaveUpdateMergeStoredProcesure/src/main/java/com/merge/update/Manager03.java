package com.merge.update;

import org.hibernate.Session;

public class Manager03 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.get(Person.class, 1);
		System.out.println(p1.getFirstname());

		System.out.println("===================");

		s1.close();
		p1.setFirstname("akash");
		s1.update(p1);
		// Once we close the session then if want to update the field then Hibernate will through exception
		//Exception in thread "main" java.lang.IllegalStateException: 
		System.out.println("done");
	}
}
