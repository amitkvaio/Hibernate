package com.storeprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.jdbc.Work;

public class Manager09 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Query q1 = s1.getNamedQuery("sp5");

		System.out.println("q1=" + q1);

		String s2 = q1.toString();
		System.out.println("s2=" + s2);

		int index = s2.indexOf("{");
		System.out.println("index=" + index);

		final String s3 = s2.substring(index, s2.length() - 1);

		System.out.println(s3);
		System.out.println("================================");

		Work w1 = new Work() {
			public void execute(Connection connection) throws SQLException {
				CallableStatement cstmt = connection.prepareCall(s3);
				cstmt.setInt(1, 15);
				cstmt.registerOutParameter(2, Types.VARCHAR);
				cstmt.execute();

				String name = cstmt.getString(2);
				System.out.println("Name=" + name);
				cstmt.close();
			}
		};
		s1.doWork(w1);
		s1.getTransaction();
		s1.close();
		System.out.println("done");
	}
}

/*
 * s2=SQLQueryImpl({call p3(?,?)}) 0123456789012345678901234567
 * 
 * s2.substring(13,s2.length()-1); s2.substring(13,27); {call p3(?,?)}
 */