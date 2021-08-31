package com.lara;

import org.hibernate.Session;

public class Manager08
{
	public static void main(String[] args)
	{
		Session s1 = Util.getSession();
		
		Person p1 = new Person();
		p1.setFirstname("sony1");
		p1.setLastname("vaio1");
		p1.setAge(20);
		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();;
		
		s1.close();
		System.out.println("done");
	}
}
