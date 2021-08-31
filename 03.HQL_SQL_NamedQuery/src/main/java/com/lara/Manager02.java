package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Query qr = s1.createQuery("select age from com.lara.Raja");
		List<Integer> list = qr.list();

		for (Integer r1 : list) {
			System.out.println(r1.intValue());
		}
		System.exit(0);
	}
}
