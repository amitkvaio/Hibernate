package com.lara;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

public class Manager021 {
	public static void main(String[] args) {

		Session s1 = Util.getSession();
		
		TypedQuery<String> typedQuery = s1.createQuery(
			    "select lastname from com.lara.Raja", String.class);
		List<String> list = typedQuery.getResultList();

		for (String s12 : list) {
			System.out.println(s12);
		}
	}
}
