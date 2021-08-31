package com.lara;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager021 {
	public static void main(String[] args) {

		Session s1 = Util.getSession();

		Query qr = s1.createQuery("select lastname from com.lara.Raja");

		List<String> list = qr.list();

		for (String s12 : list) {
			System.out.println(s12);
		}

	}
}
