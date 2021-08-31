package com.lara.annotation;

import java.util.List;

import org.hibernate.Session;

public class Manager10 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		List<Object[]> list = s1.getNamedQuery("q1").list();

		for (Object[] obj : list) {
			for (Object cols : obj) {
				System.out.print(cols + " ,");
			}
			System.out.println();
		}
		System.out.println("done");
	}

}
