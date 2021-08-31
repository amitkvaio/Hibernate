package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class Manager14 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Criteria ctr = s1.createCriteria(Person.class);

		Projection pr = Projections.property("firstname");

		ctr.setProjection(pr);

		List<String> list = ctr.list();

		for (String firstName : list) {
			System.out.println(firstName);
		}
	}
}
