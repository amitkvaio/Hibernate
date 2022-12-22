package com.lara;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Manager14 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		
		CriteriaBuilder builder = s1.getCriteriaBuilder();
		CriteriaQuery<String> criteriaQuery = builder.createQuery(String.class);
		
		Root<Person> personRoot = criteriaQuery.from(Person.class);
		criteriaQuery.multiselect(personRoot.get("firstname"));
	
		
		
		List<String> list = s1.createQuery( criteriaQuery ).getResultList();
		
		for (String firstName : list) {
			System.out.println(firstName);
		}
	}
}
