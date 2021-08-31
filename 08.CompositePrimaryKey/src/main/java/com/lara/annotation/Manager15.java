package com.lara.annotation;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

public class Manager15 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		List<Person> list = s1.getNamedQuery("q2").list();

		for (Person p1 : list) {
			System.out.println(p1.getPk().getFirstName());
			System.out.println(p1.getLastName());
			System.out.println(p1.getPk().getEmail());
			System.out.println(p1.getAge());
			System.out.println(p1.getClass());
			System.out.println("...................");
		}
	}
}
