package com.storeprocedure;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager05 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Student st = new Student();

		Query q1 = s1.getNamedQuery("sp4");
		q1.setInteger("a1", 15);
		q1.setString("a2", "btm");

		System.out.println(q1);

		s1.beginTransaction();
		q1.executeUpdate();
		s1.getTransaction().commit();
		s1.close();
	}
}
