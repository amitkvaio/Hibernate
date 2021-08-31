package com.lara;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

public class Manager11 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		List<Object[]> obj = s1.getNamedQuery("q5").list();

		for (Object[] ob : obj) {
			System.out.println(Arrays.toString(ob));
		}
		System.exit(0);
	}
}
