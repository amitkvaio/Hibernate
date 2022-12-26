package com.lara;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class Manager10 {
	public static void main(String[] args) {

		Session s1 = Util.getSession();

		CriteriaBuilder builder = s1.getCriteriaBuilder();
		CriteriaQuery<Person> criteriaQuery = builder.createQuery(Person.class);
		Root<Person> personRoot = criteriaQuery.from(Person.class);
		
		Path<String> address = personRoot.get("address");
		Path<Integer> age = personRoot.get("age");
		
		Predicate preAdd = builder.equal(address, "ranchi");
		Predicate preAge = builder.gt(age, 10);
		
		Predicate preAnd = builder.and(preAdd, preAge);
		criteriaQuery
			.select(personRoot)
			.where(preAnd);

		List<Person> list = s1
		        .createQuery(criteriaQuery)
		        .getResultList();
		

		for (Person p1 : list) {
			System.out.println(p1.getId());
			System.out.println(p1.getFirstname());
			System.out.println(p1.getLastname());
			System.out.println(p1.getAge());
			System.out.println(p1.getAddress());
			System.out.println(p1.getMarks());
			System.out.println(p1.getClass());
			System.out.println("...............");
		}
		System.exit(0);
	}
}
