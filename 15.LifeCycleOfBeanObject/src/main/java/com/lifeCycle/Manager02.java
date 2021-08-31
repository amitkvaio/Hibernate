package com.lifeCycle;

import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {

		Student st = null;

		Session s1 = Util.getSession();
		Object obj = s1.get(Student.class, 1);
		st = (Student) obj;// st is persist state

		s1.close();

		st.setSname("tech");// st is deteched state
		st.setMarks("15");

		s1.beginTransaction();
		s1.update(st);
		s1.getTransaction().commit();

		System.out.println("done");
	}
}
