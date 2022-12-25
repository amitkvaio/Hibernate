package com.lara;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

public class Manager06 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		String s2 = "select lastname,age from Raja  where firstname =:name";

		List<Object[]> objArr = s1.createNativeQuery(s2)
				.setParameter("name", "Malik")
				.getResultList();
		
		System.out.println(objArr.size());

		for (Object[] ag : objArr) {
			System.out.println(Arrays.toString(ag));
		}
		System.exit(0);
	}
}
