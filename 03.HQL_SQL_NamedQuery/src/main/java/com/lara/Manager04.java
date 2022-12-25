package com.lara;

import java.util.List;

import org.hibernate.Session;

public class Manager04 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		//sql query
		String s2 = "select * from Raja";
		
		List<Raja> empList = s1.createNativeQuery(s2, Raja.class).getResultList();
		 
		for (Raja r1 : empList) {
			System.out.println(r1.getId());
			System.out.println(r1.getFirstname());
			System.out.println(r1.getLastname());
			System.out.println(r1.getAge());
			System.out.println("--------------");
		}
		System.exit(0);
	}
}
