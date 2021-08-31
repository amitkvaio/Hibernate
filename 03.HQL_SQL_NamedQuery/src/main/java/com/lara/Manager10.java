package com.lara;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

public class Manager10 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		List<Object[]> obj = s1.getNamedQuery("q4").setInteger("param1", 20).setString("param2", "Malik").list();

		for (Object[] ob : obj) {
			System.out.println(Arrays.toString(ob));
		}
		System.exit(0);
	}
}
