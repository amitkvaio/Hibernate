package com.lara.annotation;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

public class Manager090 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		String sql = "SELECT * FROM PERSON";

		List<Object[]> list = s1.createSQLQuery(sql).list();

		for (Object[] obj : list) {
			System.out.println(Arrays.toString(obj));
		}
		System.out.println("done");
	}
}
