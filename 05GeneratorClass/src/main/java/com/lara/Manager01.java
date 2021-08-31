package com.lara;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Book b1 = new Book();

		b1.setId(101);
		b1.setAuthor("jamesJoslin");
		b1.setTitle("java");

		Book b2 = new Book();
		b2.setId(102);
		b2.setAuthor("Gravin king");
		b2.setTitle("hibernate");

		Book b3 = new Book();
		b3.setId(103);
		b3.setTitle("Clanguage");
		b3.setAuthor("BalaGuruSwami");

		s1.beginTransaction();
		s1.save(b1);
		s1.save(b2);
		s1.save(b3);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");
		System.exit(0);
	}
}
