package com.lara;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class Manager15
{
	public static void main(String[] args)
	{
		Session s1 =Util.getSession();
		
		Criteria ctr = s1.createCriteria(Person.class);
	
		Projection pr1 = Projections.property("firstname");
		Projection pr2 = Projections.property("lastname");
		
		ctr.setProjection(pr1);
		ctr.setProjection(pr2);
		
		List<String> list = ctr.list();
		
		for (String object : list)
		{
			System.out.println(object);
		}
	}
}
/*
here projection pr2 override to projection pr1
second projection over rides the first one
that is why we are able to get the 2nd projection output

*/