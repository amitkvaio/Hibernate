package com.lara;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

public class Manager18 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		


		List<Person> resultList = s1.createNamedQuery("getPersonDetails").getResultList();
		System.out.println("ResultList::"+resultList);
		
		Iterator<Person> it = resultList.iterator();
		while (it.hasNext()) {
			Person p1 = it.next();
			System.out.println(p1.getId());
			System.out.println(p1.getFirstname());
			System.out.println(p1.getLastname());
			System.out.println(p1.getAge());
			System.out.println("done");
		}
	}
}
