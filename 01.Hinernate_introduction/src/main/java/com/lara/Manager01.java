package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class Manager01 {
	public static void main(String[] args) {

		ServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
		SessionFactory factory = metadata.getSessionFactoryBuilder().build();

		Session ses = factory.openSession();

		Person p1 = new Person();
		p1.setFirstname("Kapil");
		p1.setLastname("khade");
		p1.setAge(25);

		Person p2 = new Person();
		p2.setFirstname("AMIT");
		p2.setLastname("KUMAR");
		p2.setAge(25);

		ses.beginTransaction();
		ses.save(p1);
		ses.save(p2);
		ses.getTransaction().commit();
		ses.close();
		System.out.println("done");
		System.exit(0);
	}
}