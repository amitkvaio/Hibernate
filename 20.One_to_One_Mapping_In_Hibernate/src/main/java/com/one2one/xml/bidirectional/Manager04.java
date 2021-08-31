package com.one2one.xml.bidirectional;

import org.hibernate.Session;

import util.Util;

public class Manager04 {
	public static void main(String[] args) {
		update();
		// delete();
	}

	public static void update() {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 102);
		p1.setFirstName("lara");
		p1.setLastName("technology");
		p1.getAddress().setHouseNo("123");
		p1.getAddress().setState("ANDRA");

		s1.beginTransaction();
		s1.update(p1);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("desired row is updated..");
	}

	public static void delete() {
		Session s1 = Util.getSession();
		Person p1 = (Person) s1.load(Person.class, 101);
		s1.beginTransaction();
		s1.delete(p1);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("desired row is deleted");
	}

}
