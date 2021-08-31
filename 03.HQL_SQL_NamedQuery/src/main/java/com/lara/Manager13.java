package com.lara;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Manager13
{
	public static void main(String[] args)
	{
		Session s1 = Util.getSession();

		System.out.println("-----------NATIVE---SQL----------------------");
		
		String s2 = "select * from Raja where firstname='Manoj'";

		Query qr1 = s1.createSQLQuery(s2);
		// Here we can not downcast in the POJO class  because Here Raja is the table name.

		List<Object[]> obj = qr1.list();

		for (Object[] ob : obj)
		{
			System.out.println(Arrays.toString(ob));
		}
		
		System.out.println("=================HQL================");
		
		String s3 = "from Raja where firstname='Manoj'";
		Query qr2 = s1.createQuery(s3);
		List obj1 = qr2.list();
		Iterator it = obj1.iterator();
		while(it.hasNext())
		{
			Raja r1 =(Raja)it.next();
			System.out.println(r1.getId());
			System.out.println(r1.getFirstname());
			System.out.println(r1.getLastname());
			System.out.println(r1.getAge());
		}
		
		System.out.println("=============SQL==TO HQL================");
		
		String s4 = "select * from Raja where firstname='Manoj'";
		Query qr5 = s1.createSQLQuery(s4).addEntity(Raja.class);
		List obj2 = qr5.list();
		Iterator it1 = obj1.iterator();
		while(it1.hasNext())
		{
			Raja r1 =(Raja)it1.next();
			System.out.println(r1.getId());
			System.out.println(r1.getFirstname());
			System.out.println(r1.getLastname());
			System.out.println(r1.getAge());
		}
		
		System.out.println("==============SQL====NATIVE=  89=====================");
		Query qr3 = s1.createSQLQuery(s2);
		List list = qr3.list();
		Iterator iter = list.iterator();
		
		while(iter.hasNext())
		{
			Object[] object = (Object[])iter.next();
			System.out.println(Arrays.toString(object));
		}
		
	}
}
