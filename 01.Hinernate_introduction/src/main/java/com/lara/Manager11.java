package com.lara;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager11 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		// String s2 = "from Person";//hql query
		String s2 = "select p.age from Person p";// hql query
		List<Integer> list=s1.createQuery(s2).getResultList();
		
		System.out.println("total size of the list is:" + list.size());
		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {
			Integer a1 = it.next();
			System.out.println("age=" + a1.intValue());
		}
		s1.close();
		System.exit(0);
	}
}
