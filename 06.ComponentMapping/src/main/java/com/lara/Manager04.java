package com.lara;

import org.hibernate.Session;

public class Manager04 {
	public static void main(String[] args) {
		update();
		delete();
	}

	private static void update() {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 1);

		p1.setFirstName("sony");
		p1.setLastName("vaio");
		p1.setAge(25);

		Address a1 = new Address();

		a1.setStreetName("marathali");
		a1.setState("karanataka");
		a1.setCity("Bangalore");
		p1.setAdd(a1);

		s1.beginTransaction();
		s1.update(p1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");
	}

	private static void delete() {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 3);

		s1.beginTransaction();
		s1.delete(p1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("dones");
	}
}
