
package com.lara.annotation;

import java.util.Scanner;

import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Scanner sc = new Scanner(System.in);
		String decider;

		do {
			Address a1 = new Address();
			Person p1 = new Person();
			System.out.println("Enter the  StreeName=");
			a1.setStreetName(sc.next());
			;
			System.out.println("Enter the city=");
			a1.setCity(sc.next());
			System.out.println("Enter the State=");
			a1.setState(sc.next());

			System.out.println("Enter the FirstName=");
			p1.setFirstName(sc.next());
			System.out.println("Enter the lastName=");
			p1.setLastName(sc.next());
			System.out.println("Enter the age=");
			p1.setAge(sc.nextInt());
			p1.setAdd(a1);

			s1.beginTransaction();
			s1.save(p1);
			s1.getTransaction().commit();
			System.out.println("do you want more:press 'y'");
			decider = sc.next();

		} while ("y".equalsIgnoreCase(decider));

		s1.close();
		System.out.println("end of the game");
	}
}
