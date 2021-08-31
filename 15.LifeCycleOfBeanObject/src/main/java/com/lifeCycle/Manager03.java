package com.lifeCycle;

import org.hibernate.Session;

public class Manager03 {
	public static void main(String[] args) {

		Student st = null;

		Session s1 = Util.getSession();
		Object obj = s1.get(Student.class, 1);
		st = (Student) obj;// st is persist state

		s1.close();

		st.setSname("aabba");// st is deteched state
		st.setMarks("500");

		Session s2 = Util.getSession();
		s2.beginTransaction();
		s2.merge(st);
		//s2.update(st);
		s2.getTransaction().commit();
		s2.close();

		System.out.println("done");
	}
}
