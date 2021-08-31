package com.lara;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

//reading all the data from the particular table
@SuppressWarnings("deprecation")
public class Manager10 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		String s2 = "from Person";
		Query<Person> qr = s1.createQuery(s2);

		List<Person> list = qr.list();
		for (Person person : list) {
			System.out.println(person);
		}
		
		/*Iterator<Person> it = list.iterator();

		while (it.hasNext()) {
			Person per = it.next();
			System.out.println(per);
		}*/
		s1.close();
	}
}
