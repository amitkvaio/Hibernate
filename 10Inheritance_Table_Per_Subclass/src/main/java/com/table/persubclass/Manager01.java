package com.table.persubclass;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.setFirstName("Raja");
		h1.setAge(32);

		Person p1 = new Person();
		p1.setFirstName("Amit");
		p1.setAge(31);
		p1.setAddress("Ranchi");
		p1.setCity("Bangalore");

		Employee e1 = new Employee();
		e1.setFirstName("Niraj");
		e1.setAge(26);
		e1.setAddress("New Madhukam");
		e1.setCity("Ranchi");
		e1.setDesignation("Soft Eng");
		e1.setEmail("niraj@gmail.com");

		PermanentEmployee pe = new PermanentEmployee();
		pe.setFirstName("Ajit");
		pe.setEmail("ajit@gmail.com");
		pe.setDesignation("HR");
		pe.setCity("Bihar");
		pe.setAge(19);
		pe.setAddress("Rafigunj");
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
