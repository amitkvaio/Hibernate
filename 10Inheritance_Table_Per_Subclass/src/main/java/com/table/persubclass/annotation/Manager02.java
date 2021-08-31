package com.table.persubclass.annotation;

import java.util.Scanner;

import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Scanner sc = new Scanner(System.in);
		Human h1 = null;
		Person p1 = null;
		Employee e1 = null;
		PermanentEmployee pe1 = null;

		s1.beginTransaction();

		do {
			h1 = new Human();
			System.out.println("---Human Details----");
			System.out.println("Enter the first name:");
			h1.setFirstName(sc.next());
			System.out.println("Enter the age:");
			h1.setAge(sc.nextInt());

			s1.save(h1);

			p1 = new Person();
			System.out.println("---Person Details-----");
			System.out.println("Enter the first Name");
			p1.setFirstName(sc.next());
			System.out.println("Enter the age:");
			p1.setAge(sc.nextInt());
			System.out.println("Enter tha Address:");
			p1.setAddress(sc.next());
			System.out.println("Enter the city:");
			p1.setCity(sc.next());

			s1.save(p1);

			System.out.println("---Employee Detail----");
			e1 = new Employee();
			System.out.println("Enter the first Name");
			e1.setFirstName(sc.next());
			System.out.println("Enter the age:");
			e1.setAge(sc.nextInt());
			System.out.println("Enter tha Address:");
			e1.setAddress(sc.next());
			System.out.println("Enter the city:");
			e1.setCity(sc.next());
			System.out.println("Enter the designation:");
			e1.setDesignation(sc.next());
			System.out.println("Enter the Email:");
			e1.setEmail(sc.next());

			s1.save(e1);

			System.out.println("---Permanenet Employee-----");

			pe1 = new PermanentEmployee();
			System.out.println("Enter the first Name");
			pe1.setFirstName(sc.next());
			System.out.println("Enter the age:");
			pe1.setAge(sc.nextInt());
			System.out.println("Enter tha Address:");
			pe1.setAddress(sc.next());
			System.out.println("Enter the city:");
			pe1.setCity(sc.next());
			System.out.println("Enter the designation:");
			pe1.setDesignation(sc.next());
			System.out.println("Enter the Email:");
			pe1.setEmail(sc.next());
			System.out.println("Enter the salary:");
			pe1.setSalary(sc.nextDouble());
			System.out.println("Enter the leave Count:");
			pe1.setLeavecount(sc.nextInt());

			s1.save(pe1);

			System.out.println("do you want to save one more press y/n");

		} while ("y".equalsIgnoreCase(sc.next()));
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("End of game!!!!!!!!!!!");
	}
}
