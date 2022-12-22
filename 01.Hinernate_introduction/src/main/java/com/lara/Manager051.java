package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Manager051 {
	public static void main(String[] args) {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

		Session s1 = sessionFactory.openSession();

		Person p1 = new Person();
		p1.setId(20);
		p1.setFirstname("lara");
		p1.setLastname("tech");
		p1.setAge(24);
		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		// s1.flush();
		s1.close();
		System.out.println("done");
		System.exit(0);
	}
}
