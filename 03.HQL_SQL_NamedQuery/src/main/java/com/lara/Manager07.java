package com.lara;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager07 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Query qr = s1.getNamedQuery("q1");
		List<Object[]> obj = qr.list();

		for (Object[] ob : obj) {
			System.out.println(Arrays.toString(ob));
		}

		System.out.println("----------------HQL NAMED QUERY------------------------");

		List list = s1.getNamedQuery("q6").list();
		Iterator it = list.iterator();

		while (it.hasNext()) {
			Raja r1 = (Raja) it.next();
			System.out.println(r1.getId());
			System.out.println(r1.getFirstname());
			System.out.println(r1.getLastname());
			System.out.println(r1.getAge());
			System.out.println("--------");
		}
		System.exit(0);
	}
}
