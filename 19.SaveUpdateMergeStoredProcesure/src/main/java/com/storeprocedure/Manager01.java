package com.storeprocedure;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Student st = new Student();

		st.setId(101);
		st.setName("amit");

		Student st1 = new Student();

		st1.setId(102);
		st1.setName("ajit");

		s1.beginTransaction();
		s1.save(st);
		s1.save(st1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");

	}
}
