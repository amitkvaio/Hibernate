package com.lara;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

public class Manager12 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		
		TypedQuery<Raja> typedQuery = s1.createQuery(
			    "from Raja where age<25 or firstname='chandam'", Raja.class);
		List<Raja> list = typedQuery.getResultList();

		Iterator<Raja> it = list.iterator();
		while (it.hasNext()) {
			Raja r1 = (Raja) it.next();
			System.out.println(r1.getId());
			System.out.println(r1.getFirstname());
			System.out.println(r1.getLastname());
			System.out.println(r1.getAge());
			System.out.println("............");

		}
		System.exit(0);
	}
}
