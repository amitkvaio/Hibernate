package com.lara;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class Manager17
{
	public static void main(String[] args)
	{
		Session s1 = Util.getSession();
		
		Criteria ctr = s1.createCriteria(Person.class);
		
		ProjectionList pj = Projections.projectionList();
		pj.add(Projections.property("firstname"));
		pj.add(Projections.property("age"));
		
		//Projection pr = Projections.property("age");
		
		ctr.setProjection(pj);
		
		List list = ctr.list();
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			Object[]obj =(Object[])it.next();
			System.out.println(obj[0]+"::"+obj[1]);
		}
	}
}
