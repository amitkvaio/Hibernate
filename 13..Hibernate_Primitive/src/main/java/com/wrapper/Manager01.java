package com.wrapper;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Product p1 = new Product();
		p1.setId(1);
		p1.setPname("Rice");
		p1.setPprice(45.0);

		Product p2 = new Product();
		p2.setId(2);
		p2.setPname("vegitable");

		s1.beginTransaction();
		s1.save(p1);
		s1.save(p2);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");
	}
}
