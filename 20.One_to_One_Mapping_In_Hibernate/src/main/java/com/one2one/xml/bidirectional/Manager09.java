package com.one2one.xml.bidirectional;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

import util.Util;

public class Manager09 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		String sql = "select * from person";

		List<Object[]> list = s1.createSQLQuery(sql).list();// returning lists of object
		// i.e one list means one row and a row contains multiple of column.

		for (Object[] row : list) {
			for (Object col : row) {
				System.out.println(col + " ");
			}
			System.out.println(Arrays.toString(row));
			System.out.println("...........");
		}
		System.out.println("==============================");
		String sql1 = "select * from Address";
		List<Object[]> list1 = s1.createSQLQuery(sql1).list();
		for (Object[] row : list1) {
			for (Object col : row) {
				System.out.println(col + " ");
			}
			System.out.println(Arrays.toString(row));
			System.out.println("...........");
		}
	}
}
