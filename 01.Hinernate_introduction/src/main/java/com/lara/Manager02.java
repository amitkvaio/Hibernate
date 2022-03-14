package com.lara;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Manager02 {
	public static void main(String[] args) {
		
		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
		SessionFactory factory = metadata.getSessionFactoryBuilder().build();
		Session s1 = factory.openSession();

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
			System.out.println("enter the age:");
			age = sc.nextInt();

			p1.setFirstname(fn);
			p1.setLastname(ln);
			p1.setAge(age);
			s1.save(p1);

			System.out.println("do you want more element:press y other wise any character:");
			decider = sc.next();
		} while ("y".equalsIgnoreCase(decider));
		s1.getTransaction().commit();
		s1.close();
		System.out.println("Game over:");
		System.exit(0);
	}
}
