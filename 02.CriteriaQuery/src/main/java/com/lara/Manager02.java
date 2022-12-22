package com.lara;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		CriteriaBuilder builder = s1.getCriteriaBuilder();
		CriteriaQuery<Person> criteriaQuery = builder.createQuery(Person.class);
		Root<Person> personRoot = criteriaQuery.from(Person.class);
		
		
		Path<String> firstName = personRoot.get("firstname");
		Path<String> lastname = personRoot.get("lastname");
		
		Predicate preFirst = builder.equal(firstName, "abc");
		Predicate preLast = builder.equal(lastname, "def");
		
		Predicate and = builder.and(preFirst,preLast);
		//Predicate or = builder.or(preFirst,preLast);
		
		criteriaQuery.select(personRoot).where(and); 
		 
		List<Person> list = s1.createQuery( criteriaQuery ).getResultList();

		for (Person p1 : list) {
			System.out.println(p1.getId());
			System.out.println(p1.getFirstname());
			System.out.println(p1.getLastname());
			System.out.println(p1.getAge());
			System.out.println("................");
		}
		System.exit(0);
	}
}