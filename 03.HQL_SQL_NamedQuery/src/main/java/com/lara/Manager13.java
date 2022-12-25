package com.lara;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

public class Manager13 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		System.out.println("-----------NATIVE---SQL----------------------");

		String s2 = "select * from Raja where firstname='Manoj'";
		List<Object[]> objArr = s1.createNativeQuery(s2).getResultList();

		for (Object[] ob : objArr) {
			System.out.println(Arrays.toString(ob));
		}

		System.out.println("=================HQL================");
		String s3 = "from Raja where firstname='Manoj'";
		TypedQuery<Raja> typedQuery = s1.createQuery(s3, Raja.class);
		List<Raja> list = typedQuery.getResultList();

		Iterator<Raja> it = list.iterator();
		while (it.hasNext()) {
			Raja r1 = it.next();
			System.out.println(r1.getId());
			System.out.println(r1.getFirstname());
			System.out.println(r1.getLastname());
			System.out.println(r1.getAge());
		}
	}
}
