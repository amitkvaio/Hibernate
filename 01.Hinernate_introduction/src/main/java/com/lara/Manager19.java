package com.lara;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Manager19 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		CriteriaBuilder builder = s1.getCriteriaBuilder();
		CriteriaQuery<Person> criteriaQuery = builder.createQuery(Person.class);
		Root<Person> personRoot = criteriaQuery.from(Person.class);

		criteriaQuery.where( builder.equal( personRoot.get("age"),25 ));
		List<Person> list = s1.createQuery(criteriaQuery).getResultList();

		for (Person per : list) {
			System.out.println(per);
		}
		System.exit(0);
	}
}
