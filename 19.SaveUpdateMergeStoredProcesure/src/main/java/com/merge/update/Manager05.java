package com.merge.update;

import org.hibernate.Session;

public class Manager05
{
	public static void main(String[] args)
	{
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.get(Person.class, 1);
		System.out.println(p1.getFirstname());
		System.out.println("===================");
		
		s1.close();
		
		p1.setFirstname("Ranchi");//detached state
		
		Session s2 = Util.getSession();
		Person P2 = (Person)s2.load(Person.class, 1);
		
		System.out.println(s1==s2);//two different session
		
		s2.beginTransaction();
		s2.merge(p1);//into P2 object, p1 changes are merged  and saved into the database
		s2.getTransaction().commit();
		s2.close();
		System.out.println("done");
	}
}
