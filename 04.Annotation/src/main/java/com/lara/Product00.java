package com.lara;

import org.hibernate.Session;

public class Product00 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Product p1 = new Product();

		p1.setId(1);
		p1.setProName("Rice");
		p1.setPrice(25.50);

		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		s1.close();
		System.exit(0);
	}
}
