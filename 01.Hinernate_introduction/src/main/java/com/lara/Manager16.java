package com.lara;

import java.util.Arrays;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Manager16 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		CriteriaBuilder builder = s1.getCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
		Root<Person> personRoot = criteriaQuery.from(Person.class);
		
		Path<String> firstName = personRoot.get("firstname");
		Path<String> lastname = personRoot.get("lastname");
		criteriaQuery.select( builder.array( firstName, lastname));
		
		List<Object[]> list = s1.createQuery( criteriaQuery ).getResultList();

		for (Object[] obj : list) {
			System.out.println(Arrays.toString(obj));
			/*
			 * System.out.println("............"); System.out.println(obj[0]+"=>"+obj[1]);
			 */
		}
	}
}
