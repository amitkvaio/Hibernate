package com.lara;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager12 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		String s2 = "select p.age,p.firstname,p.lastname from Person p";// hql query
		List<Object[]> list = s1.createQuery(s2).getResultList();

		System.out.println("total size of the list is:" + list.size());
		Iterator<Object[]> it = list.iterator();

		while (it.hasNext()) {
			Object[] obj = it.next();
			System.out.println("Age=" + obj[0] + " " + "FirstName=" + obj[1] + " " + "LastName=" + obj[2]);
		}
		s1.close();
		System.exit(0);
	}
}
