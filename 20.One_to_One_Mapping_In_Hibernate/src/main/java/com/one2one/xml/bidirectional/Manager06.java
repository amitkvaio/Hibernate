package com.one2one.xml.bidirectional;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import util.Util;

public class Manager06 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Criteria ctr = s1.createCriteria(Person.class);
		ctr.add(Restrictions.eq("firstName", "amit"));
		// ctr.add(Restrictions.eq("address.state","kar"));
		// ctr.add(Restrictions.eq("lastName", "kumar"));

		List<Person> list = ctr.list();

		for (Person p1 : list) {
			System.out.println(p1.getId());
			System.out.println(p1.getFirstName());
			System.out.println(p1.getLastName());
			System.out.println(p1.getAge());

			System.out.println(p1.getAddress().getHouseNo());
			System.out.println(p1.getAddress().getStreetName());
			System.out.println(p1.getAddress().getState());
			System.out.println("................................");
		}
		System.out.println("done");
	}
}
