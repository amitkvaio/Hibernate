package com.lara;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager18 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		List<Person> obj = s1.getNamedQuery("getPersonDetails").list();
		Iterator<Person> it = obj.iterator();
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
