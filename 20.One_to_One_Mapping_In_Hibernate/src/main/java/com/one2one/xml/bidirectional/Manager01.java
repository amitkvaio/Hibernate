package com.one2one.xml.bidirectional;

import org.hibernate.Session;

import util.Util;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = new Person();
		p1.setId(102);
		p1.setFirstName("amit");
		p1.setLastName("kumar");
		p1.setAge(24);

		Address ad = new Address();
		ad.setHouseNo("12/B");
		ad.setStreetName("btm");
		ad.setState("kar");

		ad.setPerson(p1);
		p1.setAddress(ad);

		s1.beginTransaction();
		s1.save(p1);
		s1.save(ad);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");
	}
}
