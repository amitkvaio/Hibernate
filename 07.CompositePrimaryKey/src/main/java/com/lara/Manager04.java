package com.lara;

import org.hibernate.Session;

public class Manager04 {
	public static void main(String[] args) {
		update();
		// delete();
	}

	private static void update() {
		Session s1 = Util.getSession();
		PersonPK pk = new PersonPK();
		pk.setFirstName("amit");
		pk.setEmail("amit@amit.com");

		Person p1 = (Person) s1.load(Person.class, pk);

		p1.setLastName("kum");
		p1.setAge(26);
		s1.beginTransaction();
		s1.update(p1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");
	}

	private static void delete() {
		Session s1 = Util.getSession();

		PersonPK pk = new PersonPK();
		pk.setFirstName("amit");
		pk.setEmail("amit@amit.com");

		Person p1 = (Person) s1.load(Person.class, pk);
		s1.beginTransaction();
		s1.delete(p1);
		s1.getTransaction().commit();
		System.out.println("done");

	}
}
