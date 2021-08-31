package com.cache.firstlevel;

import org.hibernate.Session;

public class Manager03 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Session s2 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 2);
		Person p2 = (Person) s2.load(Person.class, 2);

		System.out.println(p1 == p2);//false
		System.out.println("p1-->" + p1);
		System.out.println("p2-->" + p2);
		System.out.println(s1 == s2);
		System.out.println("done done done ");
	}
}
