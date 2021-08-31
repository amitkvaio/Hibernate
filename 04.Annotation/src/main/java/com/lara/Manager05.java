package com.lara;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

public class Manager05 {

	public static void main(String[] args) {
		Session s1 = Util.getSession();

		List<Object[]> list = s1.getNamedQuery("q4").list();

		for (Object[] obj : list) {
			System.out.println(Arrays.toString(obj));
		}
		System.out.println("done");
		System.exit(0);
	}

}
