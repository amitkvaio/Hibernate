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

public class Manager031 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		CriteriaBuilder builder = s1.getCriteriaBuilder();
		CriteriaQuery<Person> criteriaQuery = builder.createQuery(Person.class);
		Root<Person> personRoot = criteriaQuery.from(Person.class);
		
		Path<String> firstname = personRoot.get("firstname");
		Path<String> lastName = personRoot.get("lastname");
		Path<Integer> age = personRoot.get("age");
		Path<Integer> id = personRoot.get("id");
		
		
		Predicate preFirstName = builder.like(firstname, "%i%");
		Predicate preLastName = builder.equal(lastName, "khade");
		Predicate preId = builder.between(id, 8, 26);
		Predicate preAge = builder.equal(age, 25);
		
		Predicate or = builder.or(preFirstName,preLastName,preId,preAge);
		criteriaQuery.select(personRoot).where(or); 
		 
		List<Person> list = s1.createQuery( criteriaQuery ).getResultList();
		
		for (Person p1 : list) {
			System.out.println(p1.getId());
			System.out.println(p1.getFirstname());
			System.out.println(p1.getLastname());
			System.out.println(p1.getAge());
			System.out.println("...............");
		}

	}
}
