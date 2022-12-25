package com.lara;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		
		TypedQuery<Integer> typedQuery = s1.createQuery(
			    "select age from com.lara.Raja", Integer.class);
		List<Integer> list = typedQuery.getResultList();

		for (Integer r1 : list) {
			System.out.println(r1.intValue());
		}
		System.exit(0);
	}
}
