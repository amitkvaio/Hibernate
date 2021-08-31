package com.storeprocedure;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager04 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Student st = new Student();

		Query q1 = s1.getNamedQuery("sp3");
		q1.setInteger(0, 5);
		q1.setString(1, "kapil");

		System.out.println("q1:" + q1);

		s1.beginTransaction();
		q1.executeUpdate();
		s1.getTransaction().commit();
		s1.close();
	}
}
