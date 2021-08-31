package com.storeprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.Session;
import org.hibernate.jdbc.Work;

public class Manager07 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		s1.beginTransaction();
		Work w1 = new Work() {
			public void execute(Connection connection) throws SQLException {
				CallableStatement cstmt = connection.prepareCall("{call p3(?,?)}");
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
