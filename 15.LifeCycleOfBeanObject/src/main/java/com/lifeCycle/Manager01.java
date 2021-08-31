package com.lifeCycle;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		// Transient state_____start
		Student s2 = new Student();
		s2.setSid(101);
		s2.setSname("amit");
		s2.setMarks("400");

		Student s3 = new Student();
		s3.setSid(102);
		s3.setSname("ajit");
		s3.setMarks("450");

		Student s4 = new Student();
		s4.setSid(103);
		s4.setSname("rupesh");
		s4.setMarks("300");
		// Transient state_____end
		

		// Persistent state_____start
		s1.beginTransaction();
		int i = (Integer) s1.save(s2);
		System.out.println("i=" + i);

		int j = (Integer) s1.save(s3);
		System.out.println("j=" + j);

		int k = (Integer) s1.save(s4);
		System.out.println("k=" + k);

		s1.getTransaction().commit();
		// Persistent state_____end
		s1.close();

		System.out.println("done");
	}
}
