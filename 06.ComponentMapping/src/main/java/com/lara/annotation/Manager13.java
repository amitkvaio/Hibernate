package com.lara.annotation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager13 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Query q1 = s1.createQuery("select add.city from com.lara.Person");

		List<String> list = q1.list();

		for (String li : list) {
			System.out.println(li);
			System.out.println("........");
		}
		System.out.println("done");
	}
}
