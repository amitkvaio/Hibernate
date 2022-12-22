package com.lara;

import org.hibernate.Session;

public class Manager09 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = s1.load(Person.class, 1015);
		System.out.println(p1.getId());
		System.out.println("****************************************");
		System.out.println(p1.getFirstname());
		System.out.println(p1.getLastname());
		System.out.println(p1.getAge());
		System.out.println(".......load finished................");

		Person p2 =  s1.get(Person.class, 17);
		System.out.println(p2.getId());
		System.out.println(p2.getFirstname());
		System.out.println(p2.getLastname());
		System.out.println(p2.getAge());
		System.out.println(".............get finished...........");
		System.out.println("done");
		System.exit(0);
	}
}
