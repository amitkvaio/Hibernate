package com.lara;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

public class Manager08 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		
		List<Object[]> obj =s1.createNamedQuery("q2").getResultList();

		for (Object[] ob : obj) {
			System.out.println(Arrays.toString(ob));
		}
		System.exit(0);
	}
}
