package com.lara.annotation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager13 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Query qr = s1.createQuery("select pk.firstName from com.lara.Person");

		List<String> st = qr.list();

		for (String p1 : st) {
			System.out.println(p1);
			System.out.println("...................");
		}
		System.out.println("done");
	}
}
