package com.lara;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager12 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		// Query qr = s1.createQuery("from com.lara.Raja where age<25 or
		// firstname='amit'");
		Query qr1 = s1.createQuery("from Raja where age<25 or firstname='chandam'");

		/*List<Raja> list = qr1.list();

		System.out.println("--list size--" + list.size());

		for (Raja r1 : list) {
			System.out.println(r1.getId());
			System.out.println(r1.getFirstname());
			System.out.println(r1.getLastname());
			System.out.println(r1.getAge());
			System.out.println("............");
		}*/

		List list = qr1.list();
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
