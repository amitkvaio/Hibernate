package com.one2one.xml.bidirectional;

import java.util.Scanner;

import org.hibernate.Session;

import util.Util;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Scanner sc = new Scanner(System.in);
		s1.beginTransaction();

		do {
			Person p1 = new Person();

			System.out.println("Enter the id of the person:");
			p1.setId(sc.nextInt());
			System.out.println("Enter the first name:");
			p1.setFirstName(sc.next());
			System.out.println("Enter the last Name:");
			p1.setLastName(sc.next());
			System.out.println("Enter the age:");
			p1.setAge(sc.nextInt());

			Address ad = new Address();
			System.out.println("Enter the House No:");
			ad.setHouseNo(sc.next());
			System.out.println("Enter the street Name:");
			ad.setStreetName(sc.next());
			System.out.println("Enter the state:");
			ad.setState(sc.next());

			p1.setAddress(ad);
			ad.setPerson(p1);

			s1.save(p1);
			s1.save(ad);

			System.out.println("DO you want more? press y/n");

		} while ("y".equalsIgnoreCase(sc.next()));

		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("end of the game");
	}
}
