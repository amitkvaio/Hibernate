package com.lara;

import java.util.List;

import org.hibernate.Session;

public class Manager04 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		List<Person> list = s1.getNamedQuery("q3").setInteger("param1", 14).setString("param2", "nepali").list();

		for (Person obj : list) {
			System.out.println(obj.getId());
			System.out.println(obj.getFirstname());
			System.out.println(obj.getLastname());
			System.out.println(obj.getAge());
			System.out.println(obj.getMarks());
			System.out.println(obj.getAddress());
			System.out.println(".............");
		}
		System.out.println("done");
		System.exit(0);
	}
}
