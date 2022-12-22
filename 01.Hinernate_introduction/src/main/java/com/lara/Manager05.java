package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Manager05 {
	public static void main(String[] args) {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
		Session ses = sessionFactory.openSession();

		Person per = ses.load(Person.class, 16);
		System.out.println("Before update Person object ::" + per);
		ses.beginTransaction();
		per.setFirstname("kalyani");
	
		ses.update(per);
		System.out.println("After update Person object ::" + per);
		ses.getTransaction().commit();
		//ses.flush();
		ses.close();
		System.out.println("Done");
		System.exit(0);
	}
}
