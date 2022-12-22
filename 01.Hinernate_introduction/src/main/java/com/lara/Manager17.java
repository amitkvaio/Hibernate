package com.lara;

import java.util.Iterator;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class Manager17 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		
		
		CriteriaBuilder builder = s1.getCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
		Root<Person> personRoot = criteriaQuery.from(Person.class);
		
		Path<String> firstName = personRoot.get("firstname");
		Path<Integer> age = personRoot.get("age");
		criteriaQuery.select( builder.array( firstName, age));
		
		List<Object[]> list = s1.createQuery( criteriaQuery ).getResultList();

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object[] obj = (Object[]) it.next();
			System.out.println(obj[0] + "::" + obj[1]);
		}
	}
}
