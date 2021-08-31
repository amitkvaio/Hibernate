package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class Manager06 {
	public static void main(String[] args) {

		Session s1 = Util.getSession();

		Criteria ctr = s1.createCriteria(Person.class);

		ctr.add(Restrictions.eq("add.city", "Bangalore"));
		ctr.add(Restrictions.gt("age", 10));

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
