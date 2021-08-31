package com.lara.annotation;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

public class Manager09 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		String sql = "select * from Person";

		List<Object[]> list = s1.createSQLQuery(sql).list();

		for (Object[] obj : list) {
			for (Object col : obj) {
				System.out.println(col + ",");
			}
			System.out.println("........");
		}
		System.out.println("done");

	}
}
