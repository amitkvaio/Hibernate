package com.lara;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager06 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		String s2 = "select lastname,age from Raja where firstname=?";

		Query qr1 = s1.createSQLQuery(s2);
		qr1.setString(0, "Malik");
		
		List<Object[]> obj = qr1.list();

		for (Object[] ag : obj) {
			System.out.println(Arrays.toString(ag));
		}
		System.exit(0);
	}
}
