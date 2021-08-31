package com.lara;

import java.util.List;

import org.hibernate.Session;

public class Manager150 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		List<Object[]> list = s1.getNamedQuery("q3").setInteger("param1", 24).list();

		for (Object[] obj : list) {
			for (Object col : obj) {
				System.out.print(col + ",");
			}
			System.out.println();
		}
	}
}
