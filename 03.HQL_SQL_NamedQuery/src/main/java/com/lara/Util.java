package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Util {
	static SessionFactory sf = null;

	static {
		/*
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		sf = metadata.getSessionFactoryBuilder().build();
		*/
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		sf = configuration.buildSessionFactory(builder.build());
	}

	public static Session getSession() {
		return sf.openSession();
	}
}
