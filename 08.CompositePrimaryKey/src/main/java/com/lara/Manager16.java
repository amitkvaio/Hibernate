package com.lara;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

public class Manager16 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		List<Object[]> list = s1.getNamedQuery("q3").setInteger("param1", 15).setString("param2", "kumar").list();

		for (Object[] obj : list) {
			System.out.println(Arrays.toString(obj));
		}
	}
}
