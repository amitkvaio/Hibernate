package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Home extends HttpServlet {
	public SessionFactory sf;

	@Override
	public void init() throws ServletException {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		sf = metadata.getSessionFactoryBuilder().build();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String joiningDate = request.getParameter("joiningDate");
		String dob = request.getParameter("dob");
		String education = request.getParameter("education");
		String salary = request.getParameter("salary");
		String gender = request.getParameter("gender");
		System.out.println("form service");

		Session s1 = sf.openSession();

		Student st = new Student();
		st.setFirstname(firstname);
		st.setLastname(lastname);
		st.setJoiningDate(joiningDate);
		st.setDob(dob);
		st.setEducation(education);
		st.setSalary(salary);
		st.setGender(gender);

		s1.beginTransaction();
		s1.save(st);
		s1.getTransaction().commit();

		System.out.println("Student data has saved successfully in the db!!");
		RequestDispatcher rd = request.getRequestDispatcher("Success");
		rd.forward(request, response);

		PrintWriter out = response.getWriter();
		out.println();
		out.println("Record is addded successfully");

		s1.close();
	}

	public void destroy() {
		if (sf != null) {
			System.out.println("form destroy");
			sf.close();
		}
	}
}