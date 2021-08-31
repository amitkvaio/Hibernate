package com.lara.annotation;

import java.util.Scanner;

import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Scanner sc = new Scanner(System.in);
		PersonPK pk = null;
		Person p1 = null;
		s1.beginTransaction();
		do {
			pk = new PersonPK();
			p1 = new Person();
			System.out.println("enter the first name:");
			pk.setFirstName(sc.next());
			System.out.println("enter the Email name:");
			pk.setEmail(sc.next());
			System.out.println("enter the last name");
			p1.setLastName(sc.next());
			System.out.println("enter the age:");
			p1.setAge(sc.nextInt());
			p1.setPk(pk);
			s1.save(p1);
			System.out.println("do you want to save one more y/n:");
		} while ("y".equalsIgnoreCase(sc.next()));
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("done");

	}
}
