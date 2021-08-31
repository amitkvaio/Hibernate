package com.product;

import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Product p = new Product();

		p.setProductId(101);
		p.setProName("iPhone");

		Product p1 = (Product) s1.load(Product.class, p);
		// here p must be an serializable object,

		System.out.println(p1.getProductId());
		System.out.println(p1.getPrice());

		System.out.println("Object Loaded successfully.....!!");
		s1.close();

		System.out.println("done");
	}
}
