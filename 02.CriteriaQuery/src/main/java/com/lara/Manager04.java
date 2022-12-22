package com.lara;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Manager04 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		
		
		CriteriaBuilder builder = s1.getCriteriaBuilder();
		CriteriaQuery<Person> criteriaQuery = builder.createQuery(Person.class);
		Root<Person> personRoot = criteriaQuery.from(Person.class);
		
		
		Path<String> lastName = personRoot.get("lastname");
		Path<Integer> age = personRoot.get("age");
		
		Predicate preAge = builder.le(age, 25);
		Predicate preLastName = builder.like(lastName, "%a%");
		
		Predicate or = builder.or(preAge,preLastName);
		criteriaQuery.select(personRoot).where(or); 
		 
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
