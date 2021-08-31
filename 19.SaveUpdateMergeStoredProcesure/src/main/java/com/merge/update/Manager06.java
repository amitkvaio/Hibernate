// Dirty Checking program.

package com.merge.update;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager06 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.get(Person.class, 1);

		Transaction tx = s1.beginTransaction();
		p1.setFirstname("Jharkhand");

		tx.commit();
		s1.close();
		System.out.println("done");
	}
}
