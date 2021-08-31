package com.multipledb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Manager01 {
	public static void main(String[] args) {
		Student st = new Student();
		st.setSname("amit");
		st.setMarks("a101");
		st.setSid(12);

		saveInOracle(st);
		// saveInMysql(st);
	}

	private static void saveInOracle(Student p1) {
		Configuration con = new Configuration().configure();
		StandardServiceRegistryBuilder sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		SessionFactory sf = con.buildSessionFactory(sr.build());
		Session s1 = sf.openSession();

		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("done");

	}
	
	public static Session sessionForStoreDataInOracle() {
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		StandardServiceRegistryBuilder sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		SessionFactory sf = con.buildSessionFactory(sr.build());
		Session s1 = sf.openSession();
		return s1;

	}

	public static Session seesionForStoreDataInMysql() {
		Configuration con = new Configuration().configure("mysql-config.xml");
		StandardServiceRegistryBuilder sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		SessionFactory sf = con.buildSessionFactory(sr.build());
		Session s1 = sf.openSession();
		return s1;
	}
}
