package com.lara.annotation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Manager17 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Criteria ctr = s1.createCriteria(Person.class);

		Criterion c1 = Restrictions.like("add.StreetName", "%btm");// END WITH CHARACTER M
		Criterion c2 = Restrictions.gt("age", 10);
		Criterion sum = Restrictions.and(c1, c2);// if both the condition satisfy then only query will execute
		ctr.add(sum);

		List<Person> list = ctr.list();

		for (Person p1 : list) {
			System.out.println(p1.getId());
			System.out.println(p1.getFirstName());
			System.out.println(p1.getLastName());
			System.out.println(p1.getAge());
			System.out.println(p1.getAdd().getStreetName());
			System.out.println(p1.getAdd().getCity());
			System.out.println(p1.getAdd().getState());
			System.out.println(".............");
		}
	}
}
