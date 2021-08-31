package com.one2one.xml.unidirectional;

import org.hibernate.Session;

import util.Util;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Student st1 = new Student();
		st1.setSid(101);
		st1.setSname("amit");

		Student st2 = new Student();
		st2.setSid(102);
		st2.setSname("Raja");

		Student st3 = new Student();
		st3.setSid(103);
		st3.setSname("DK");

		Address ad1 = new Address();
		ad1.setAdid(101);
		ad1.setState("jharkhand");

		Address ad2 = new Address();
		ad2.setAdid(102);
		ad2.setState("Tamilnadu");

		Address ad3 = new Address();
		ad3.setAdid(103);
		ad3.setState("Dharbanga");

		ad1.setStudent(st1);
		ad2.setStudent(st2);
		ad3.setStudent(st3);

		s1.beginTransaction();
		s1.save(st1);
		s1.save(st2);
		s1.save(st3);
		s1.save(ad1);
		s1.save(ad2);
		s1.save(ad3);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");

	}
}
