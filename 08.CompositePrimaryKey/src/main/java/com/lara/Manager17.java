package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Manager17 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Criteria ctr = s1.createCriteria(Person.class);

		Criterion c1 = Restrictions.like("pk.firstName", "a%");
		Criterion c2 = Restrictions.gt("age", 20);
		Criterion sum = Restrictions.and(c1, c2);
		ctr.add(sum);

		List<Person> list = ctr.list();

		for (Person p1 : list) {
			System.out.println(p1.getPk().getFirstName());
			System.out.println(p1.getLastName());
			System.out.println(p1.getAge());
			System.out.println(p1.getPk().getEmail());
			System.out.println("...............");
		}

	}
}
