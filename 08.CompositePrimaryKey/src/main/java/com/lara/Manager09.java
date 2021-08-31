package com.lara;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class Manager09 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		String sql = "select * from person";

		List<Object[]> list = s1.createSQLQuery(sql).list();
		// SQLQuery query=s1.createSQLQuery(sql);

		for (Object[] obj : list) {
			for (Object cols : obj) {
				System.out.print(cols + " ,");
			}
			System.out.println();
		}
		System.out.println("done");
	}
}
