package com.versioning;

import java.util.Scanner;

import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		String fn, ln, decider;
		int age;
		Scanner sc = new Scanner(System.in);

		Person p1 = null;
		s1.beginTransaction();
		do {
			p1 = new Person();

			System.out.println("enter the first name:");
			fn = sc.next();
			System.out.println("enter the last name:");
			ln = sc.next();

			p1.setFirstname(fn);
			p1.setLastname(ln);
			s1.save(p1);

			System.out.println("do you want more element:press y other wise any character:");
			decider = sc.next();
		} while ("y".equalsIgnoreCase(decider));
		s1.getTransaction().commit();
		s1.close();
		System.out.println("game over:");
	}
}
