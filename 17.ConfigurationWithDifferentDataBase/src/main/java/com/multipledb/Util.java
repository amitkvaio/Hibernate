package com.multipledb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Util {
	public static SessionFactory sf = null;
	public static StandardServiceRegistryBuilder sr = null;

	static {
		Configuration con = new Configuration();

		con.setProperty("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		con.setProperty("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
		con.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@localhost:1521:XE");
		con.setProperty("hibernate.connection.username", "system");
		con.setProperty("hibernate.connection.password", "amit");

		con.setProperty("hibernate.hbm2ddl.auto", "create");

		con.setProperty("hibernate.show_sql", "true");

		con.addResource("com/lara/Person.hbm.xml");

		sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		sf = con.buildSessionFactory(sr.build());
	}

	public static Session getSession() {
		return sf.openSession();
	}
}
