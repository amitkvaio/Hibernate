package com.storeprocedure;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Student st = new Student();

		Query q1 = s1.getNamedQuery("sp1");

		System.out.println(q1);

		s1.beginTransaction();
		q1.executeUpdate();
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
