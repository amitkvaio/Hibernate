package com.lara;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class Manager16 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Criteria ctr = s1.createCriteria(Person.class);

		ProjectionList pr0 = Projections.projectionList();

		Projection pr1 = Projections.property("firstname");
		Projection pr2 = Projections.property("lastname");

		pr0.add(pr1);
		pr0.add(pr2);

		ctr.setProjection(pr0);

		List<Object[]> list = ctr.list();

		for (Object[] obj : list) {
			System.out.println(Arrays.toString(obj));
			/*
			 * System.out.println("............"); System.out.println(obj[0]+"=>"+obj[1]);
			 */
		}
	}
}
