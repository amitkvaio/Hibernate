package com.lara;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Manager07 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		CriteriaBuilder builder = s1.getCriteriaBuilder();
		CriteriaQuery<Person> criteriaQuery = builder.createQuery(Person.class);
		Root<Person> personRoot = criteriaQuery.from(Person.class);
		
		
		Path<String> firstname = personRoot.get("firstname");
		Predicate like = builder.like(firstname, "%ab%");
		
		Predicate preAnd = builder.and(like);
			
		criteriaQuery.select(personRoot).where(preAnd); 
		 
		List<Person> list = s1.createQuery( criteriaQuery ).getResultList();
		 
		for (Person p1 : list) {
			System.out.println(p1.getId());
			System.out.println(p1.getFirstname());
			System.out.println(p1.getLastname());
			System.out.println(p1.getAge());
			System.out.println(".............");
		}
		System.exit(0);
	}
}
