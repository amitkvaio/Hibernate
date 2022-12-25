package com.lara;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

public class Manager03 {
	public static void main(String[] args) {

		Session s1 = Util.getSession();
		
		TypedQuery<Object[]> typedQuery = s1.createQuery(
			    "select firstname,lastname,age from com.lara.Raja", Object[].class);
		List<Object[]> list = typedQuery.getResultList();
		 
		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object[] obj = (Object[]) it.next();
			System.out.println("FIRST NAME-->" + obj[0] + "-LASTNAME-->" + obj[1] + "--AGE-->" + obj[2]);
		}
		System.exit(0);
	}
}
