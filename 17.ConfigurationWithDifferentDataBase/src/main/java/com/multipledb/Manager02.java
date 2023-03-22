package com.multipledb;

import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {

		Student st = null;

		Session s1 = Util.getSession();
		Object obj = s1.load(Student.class, 1);
		st = (Student) obj;// st is persist state

		s1.close();

		st.setSname("tech");// st is deteched state

		Session s2 = Util.getSession();

		Student s3 = (Student) s2.load(Student.class, 1);

		s2.beginTransaction();
		s2.update(st);
		// s2.merge(st);
		s2.getTransaction().commit();
		s2.flush();
		s2.close();

		System.out.println("done");
	}
}
