package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Criteria ctr = s1.createCriteria(Person.class);
		
		Criterion ctr1 = Restrictions.eq("firstname", "abc");
		Criterion ctr2 = Restrictions.eq("lastname", "def");
		
		ctr.add(ctr1);
		ctr.add(ctr2);
		List<Person> list = ctr.list();

		for (Person p1 : list) {
			System.out.println(p1.getId());
			System.out.println(p1.getFirstname());
			System.out.println(p1.getLastname());
			System.out.println(p1.getAge());
			System.out.println("................");
		}
	}
}
/*
•	If we want to put conditions to load data from database, using criteria then 
		we need to create one Criterion Interface object and we need to add this object to Criteria Class object
•	Criterion is an interface given in “org.hibernate.criterion” package

•	In order to get Criterion object, we need to use Restrictions class.
o	Restrictions is the factory for producing Criterion objects.
•	In Restrictions class, we have all static methods and each method of this class returns Criterion object
•	Restrictions class is also given in “org.hibernate.criterion” package

*/