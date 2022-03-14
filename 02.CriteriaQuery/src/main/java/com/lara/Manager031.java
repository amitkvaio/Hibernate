package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Manager031 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Criteria ctr = s1.createCriteria(Person.class);

		Criterion c1 = Restrictions.eq("lastname", "kumar");
		Criterion c2 = Restrictions.like("firstname", "l%");
		Criterion c3 = Restrictions.between("id", 8, 10);

		Criterion c4 = Restrictions.eq("age", 25);

		Criterion c5 = Restrictions.or(c1, c2, c3, c4);

		ctr.add(c5);

		List<Person> list = ctr.list();

		for (Person p1 : list) {
			System.out.println(p1.getId());
			System.out.println(p1.getFirstname());
			System.out.println(p1.getLastname());
			System.out.println(p1.getAge());
			System.out.println("...............");
		}

	}
}
