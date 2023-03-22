package com.concrete.annotation;

import org.hibernate.Session;

import com.concrete.Util;

public class Manager01 {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.setFirstName("Raja");
		h1.setAge(32);

		Person p1 = new Person();
		p1.setFirstName("Raja");
		p1.setAge(32);
		p1.setAddress("BTM");
		p1.setCity("Bangalore");

		Employee e1 = new Employee();
		e1.setFirstName("Raja");
		e1.setAge(32);
		e1.setAddress("BTM");
		e1.setCity("Bangalore");
		e1.setDesignation("Soft Eng");
		e1.setEmail("raja@gmail.com");

		PermanentEmployee pe = new PermanentEmployee();
		pe.setFirstName("Raja");
		pe.setEmail("raja@gmail.com");
		pe.setDesignation("Soft Eng");
		pe.setCity("Bangalore");
		pe.setAge(32);
		pe.setAddress("BTM");
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
