package com.cache.secondLevel;

import java.util.Scanner;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Session s1 = Util.getSession();

		s1.beginTransaction();

		do {
			Person p1 = new Person();
			System.out.println("Enter the First Name:");
			p1.setFirstName(sc.next());
			System.out.println("Enter the Last Name:");
			p1.setLastName(sc.next());
			System.out.println("Enter the Age:");
			p1.setAge(sc.nextInt());
			s1.save(p1);
			System.out.println("Do you want more press y/n?");

		} while (sc.next().equalsIgnoreCase("y"));

		s1.getTransaction().commit();
		s1.close();
		System.out.println("Game is over:");
	}
}
