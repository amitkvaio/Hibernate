package com.save.persist;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Person p1 = new Person();
		p1.setId(101);
		p1.setFirstname("amit");
		p1.setLastname("kumar");
		p1.setAge(24);

		Person p2 = new Person();
		p2.setId(102);
		p2.setFirstname("ajit");
		p2.setLastname("kumar");
		p2.setAge(14);

		s1.beginTransaction();

		Integer num1 = (Integer) s1.save(p1);
		Integer num2 = (Integer) s1.save(p2);

		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
		s1.getTransaction().commit();
		s1.close();

		System.out.println("done");
	}
}
/*
If our generator class is assigned, then there is no difference between save() and persist() methods.
Because generator �assigned� means, as  a programmer we need to give the primary key value to save
in the database.

In case of other than assigned generator class, suppose if our generator class name is Increment
means hibernate it self will assign the primary key id value into the database right
other than assigned generator, hibernate only used to take care the primary key id value remember.
so in this case if we call save() or persist() method then it will insert the record into the database normally

But here thing is,  save() method can return that primary key id value which is generated by hibernate.


 persist() will never give any value back to the client

 
*/