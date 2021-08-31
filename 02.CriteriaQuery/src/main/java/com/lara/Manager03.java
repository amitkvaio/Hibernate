package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Manager03 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Criteria ctr = s1.createCriteria(Person.class);

		Criterion c1 = Restrictions.eq("firstname", "amit");
		Criterion c2 = Restrictions.ge("age", 30);

		Criterion c3 = Restrictions.or(c1, c2);
		ctr.add(c3);

		List<Person> list = ctr.list();

		for (Person p1 : list) {
			System.out.println(p1.getId());
			System.out.println(p1.getFirstname());
			System.out.println(p1.getLastname());
			System.out.println(p1.getAge());
			System.out.println("..............");
		}
		System.exit(0);
	}
}
