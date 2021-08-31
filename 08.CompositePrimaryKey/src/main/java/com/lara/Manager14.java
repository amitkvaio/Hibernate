package com.lara;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager14 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Query qr = s1.createQuery("select pk.firstName,lastName from com.lara.Person");

		List<Object[]> list = qr.list();

		for (Object[] obj : list) {
			System.out.println(Arrays.toString(obj));
		}
	}
}
