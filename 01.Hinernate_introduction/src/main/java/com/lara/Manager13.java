package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class Manager13 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Criteria ctr = s1.createCriteria(Person.class);
		
		Criterion c1 = Restrictions.ge("age", 25);
		ctr.add(c1);
		// ctr.addOrder(Order.desc("age"));

		List<Person> list = ctr.list();
		for (Person per : list) {
			System.out.println(per);
		}
	}
}
