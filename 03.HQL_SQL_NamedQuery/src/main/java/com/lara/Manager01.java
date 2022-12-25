package com.lara;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		
		TypedQuery<Raja> typedQuery = s1.createQuery(
			    "from Raja", Raja.class);
		 
		List<Raja> list = typedQuery.getResultList();
		 

		for (Raja r1 : list) {
			System.out.println(r1.getId());
			System.out.println(r1.getFirstname());
			System.out.println(r1.getLastname());
			System.out.println(r1.getAge());
			System.out.println("..............");
		}

		List<Raja> li = typedQuery.getResultList();
		Iterator<Raja> itet = li.iterator();

		while (itet.hasNext()) {
			Raja r1 = itet.next();
			System.out.println(r1.getId());
			System.out.println(r1.getFirstname());
			System.out.println(r1.getLastname());
			System.out.println(r1.getAge());
			System.out.println("..............");
		}
		System.exit(0);
	}
}
