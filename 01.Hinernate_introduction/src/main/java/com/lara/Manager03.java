package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Manager03 {
	public static void main(String[] args) {

		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		SessionFactory factory = metadata.getSessionFactoryBuilder().build();
		Session s1 = factory.openSession();

		
	    Person p1 = s1.load(Person.class, 1);
		
	    System.out.println("p1="+p1);
		
		System.out.println(p1.getId());
		System.out.println(p1.getFirstname());
		System.out.println(p1.getLastname());
		System.out.println(p1.getAge());
		System.out.println("done");
		System.exit(0);
	}
}
