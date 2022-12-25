package com.lara;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

public class Manager07 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		
		List<Object[]> resultList =s1.createNamedQuery("q1").getResultList();
		
		System.out.println("ResultList::"+resultList.size());
		
		for (Object[] ob : resultList) {
			System.out.println(Arrays.toString(ob));
		}
		System.exit(0);
	}
}
