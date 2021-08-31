package com.lara.annotation;

import org.hibernate.Session;

public class Manager03 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		PersonPK pk = new PersonPK();
		pk.setFirstName("ajit");
		pk.setEmail("ajit@ajit.com");
		Person p1 = (Person) s1.load(Person.class, pk);
		System.out.println(p1.getLastName());
		System.out.println(p1.getAge());
		System.out.println(p1.getPk().getFirstName());
		System.out.println(p1.getPk().getEmail());
		System.out.println("done");
	}
}
