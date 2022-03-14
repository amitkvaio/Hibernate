package com.lara;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		//Query<Raja> qr = s1.createQuery("from Raja");
		 Query qr = s1.createQuery("from com.lara.Raja");

		List<Raja> list = qr.list();

		for (Raja r1 : list) {
			System.out.println(r1.getId());
			System.out.println(r1.getFirstname());
			System.out.println(r1.getLastname());
			System.out.println(r1.getAge());
			System.out.println("..............");
		}

		List<Raja> li = qr.list();
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
