package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Manager06 {
	public static void main(String[] args) {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();

		Session s1 = sf.openSession();
		Person p1 = s1.load(Person.class, 16);
		s1.beginTransaction();
		s1.delete(p1);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");
		System.exit(0);
	}
}
