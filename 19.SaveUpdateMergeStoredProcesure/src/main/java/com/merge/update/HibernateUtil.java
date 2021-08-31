package com.merge.update;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public class HibernateUtil {
	public static final ThreadLocal local = new ThreadLocal();

	public static Session currentSession() throws HibernateException {

		Session session = (Session) local.get();

		// open a new session if this thread has no session
		if (session == null) {
			session = Util.getSession();
			local.set(session);
		}
		return session;
	}
}
