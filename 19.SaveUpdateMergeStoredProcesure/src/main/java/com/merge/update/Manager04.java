package com.merge.update;

import org.hibernate.Session;

public class Manager04 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = (Person) s1.load(Person.class, 1);
		System.out.println(p1.getFirstname());

		System.out.println("===================");

		s1.close();

		p1.setFirstname("accer");// detached state

		s1.beginTransaction();
		s1.update(s1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("--done--");
	}
}

/*
this is applicable for load and get method both
while converting from detached state into persists state, if already another object is available
in that session with the same Id then the update() method fails, because that session can not
maintain two object with the same Id.
so hibernate fails the operation and throw NonUniqueObjectException.
if the update() fails then we need to call merge() method, to convert a detached object into a
persistent state object

In case of merge(), hibernate verifies  whether any changes are there in the Detached object it compare
with persists object and if changes exist then copies the changes from detached object into persists object
and then transfer the changes to the database.
*/