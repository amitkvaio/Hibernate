package com.lara;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager04 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		String s2 = "select * from Raja";

		Query qr1 = s1.createSQLQuery(s2);

		List<Object[]> obj = qr1.list();

		for (Object[] ob : obj) {
			System.out.println(Arrays.toString(ob));
		}
		System.exit(0);
	}
}
