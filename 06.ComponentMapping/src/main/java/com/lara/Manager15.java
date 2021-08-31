package com.lara;

import java.util.List;

import org.hibernate.Session;

public class Manager15 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		List<Object[]> list = s1.getNamedQuery("q2").list();

		for (Object[] p1 : list) {
			for (Object col : p1) {
				System.out.print(col + ",");
			}
			System.out.println();
		}
	}
}
