package com.collection;

import java.util.Arrays;

import org.hibernate.Session;

public class Manager02 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Student st = (Student) s1.load(Student.class, 1);

		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(Arrays.toString(st.getProjects()));
		System.out.println(st.getSkills());
		System.out.println(st.getMarks());
		System.out.println(st.getJobs());
		System.out.println(st.getEducation());
		System.out.println("DONE");
	}
}
