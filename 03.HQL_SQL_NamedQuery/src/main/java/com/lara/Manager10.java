package com.lara;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

public class Manager10 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		
		List<Object[]> obj =s1.createNamedQuery("q4")
				.setParameter("param1", 20)
				.setParameter("param2", "Malik")
				.getResultList();
		
		for (Object[] ob : obj) {
			System.out.println(Arrays.toString(ob));
		}
		System.exit(0);
	}
}
