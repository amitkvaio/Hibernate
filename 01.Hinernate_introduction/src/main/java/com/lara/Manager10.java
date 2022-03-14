package com.lara;

import java.util.List;

import org.hibernate.Session;

//reading all the data from the particular table
public class Manager10 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		String s2 = "from Person";
		
		List<Person> perList=s1.createQuery(s2).getResultList();
		
		for (Person person : perList) {
			System.out.println(person);
		}
		
		/*Iterator<Person> it = list.iterator();

		while (it.hasNext()) {
			Person per = it.next();
			System.out.println(per);
		}*/
		s1.close();
		System.exit(0);
	}
}
