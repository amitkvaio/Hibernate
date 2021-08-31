package com.product;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Product p = new Product();

		p.setProductId(101);
		p.setProName("iPhone");
		p.setPrice(25000);

		s1.beginTransaction();
		s1.save(p);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");
	}
}
