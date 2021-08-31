package com.programmaticConfiguration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Util {
	public static SessionFactory sf = null;
	static {
		Configuration config = new Configuration();
		config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/amitdb");
		config.setProperty("hibernate.connection.username", "root");
		config.setProperty("hibernate.connection.password", "amit");
		config.setProperty("hibernate.hbm2ddl.auto", "create");
		config.setProperty("hibernate.show_sql", "true");
		config.addResource("com/programmaticConfiguration/Person.hbm.xml");
		// config.addAnnotatedClass(Users.class);
		// used above for if we are using annotation

		try {
			sf = config.buildSessionFactory();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static Session getSession() {
		return sf.openSession();
	}
}
