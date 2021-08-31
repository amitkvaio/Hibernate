package com.per.hierarchy.annotation;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.setId(1);
		h1.setFirstName("lara");
		h1.setAge(23);

		Person p1 = new Person();
		p1.setId(2);
		p1.setFirstName("rst");
		p1.setAge(34);
		p1.setAddress("btm");
		p1.setCity("bang");

		Employee e1 = new Employee();
		e1.setId(3);
		e1.setFirstName("abc");
		e1.setAge(56);
		e1.setAddress("ameerpeta");
		e1.setCity("hyd");
		e1.setDesignation("swe");
		e1.setEmail("a@a.com");

		PermanentEmployee pe = new PermanentEmployee();
		pe.setId(4);
		pe.setFirstName("amit");
		pe.setEmail("amit@a.com");
		pe.setDesignation("HR");
		pe.setCity("ranchi");
		pe.setAge(24);
		pe.setAddress("marathali");
		pe.setLeavecount(152);
		pe.setSalary(52686.56);

		Session s1 = Util.getSession();
		s1.beginTransaction();
		s1.save(h1);
		s1.save(p1);
		s1.save(e1);
		s1.save(pe);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");

	}
}
