package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Util {
	static SessionFactory sf = null;

	static {
		
		
		// For Hibernate 5
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		sf = metadata.getSessionFactoryBuilder().build();
		
		/*
		// in Hibernate 4
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		sf = configuration.buildSessionFactory(builder.build());
		*/
				
	}

	public static Session getSession() {
		return sf.openSession();
	}
}
