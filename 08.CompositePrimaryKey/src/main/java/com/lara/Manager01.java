package com.lara;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		PersonPK pk = new PersonPK();

		pk.setFirstName("amit");
		pk.setEmail("amit@amit.com");

		Person p1 = new Person();
		p1.setLastName("kumar");
		p1.setAge(24);
		p1.setPk(pk);

		Transaction tx = s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction();
		tx.commit();
		s1.close();
		System.out.println("done");

	}
}
