package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Util {
	static SessionFactory sf = null;

	public static Session getSession() {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();

		if (sf != null) {
			return sf.openSession();
		} else {
			return sf.getCurrentSession();
		}
	}
}
