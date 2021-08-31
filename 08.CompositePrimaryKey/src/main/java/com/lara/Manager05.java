package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class Manager05 {
	public static void main(String[] args) {
		Session session = Util.getSession();
		Criteria ctr = session.createCriteria(Person.class);
		List<Person> perList = ctr.list();
		for (Person per : perList) {
			System.out.println(per.getPk().getFirstName());
			System.out.println(per.getPk().getEmail());
			System.out.println(per.getAge());
			System.out.println(per.getAge());
			System.out.println("--------------------");
		}
		System.out.println("done");
	}
}
