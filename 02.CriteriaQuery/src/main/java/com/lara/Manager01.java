package com.lara;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		
		CriteriaBuilder builder = s1.getCriteriaBuilder();
		CriteriaQuery<Person> criteriaQuery = builder.createQuery(Person.class);
		Root<Person> personRoot = criteriaQuery.from(Person.class);
		criteriaQuery.select(personRoot);
		
		List<Person> list1 = s1.createQuery( criteriaQuery ).getResultList();
		
		for (Person p1 : list1) {
			System.out.println(p1.getId());
			System.out.println(p1.getFirstname());
			System.out.println(p1.getLastname());
			System.out.println(p1.getAge());
			System.out.println("..............");
		}
	}
}

/*

Criteria is only for selecting the data from the database, 
that to we can select complete objects only not partial objects,

in fact by combining criteria and projections concept we can select
partial objects too we will see this angle later,

but for now see how we are using criteria for selecting complete objects form the database.
We cant perform non-select operations using this criteria.
Criteria is suitable for executing dynamic queries too,
let us see how to use this criteria queries in the hibernate..

syntax:
Criteria crit = session.createCriteria(–Our class object–);
*/