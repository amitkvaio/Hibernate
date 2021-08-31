package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;

public class Manager01 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Student st = new Student();
		st.setId(101);
		st.setName("abc");

		String[] projects = { "citi", "hdfc", "kotak" };
		st.setProjects(projects);

		Collection skill = new ArrayList();
		skill.add("c");
		skill.add("c++");
		skill.add("java");
		st.setSkills(skill);

		List marks = new ArrayList();
		marks.add(100);
		marks.add(200);
		marks.add(300);
		st.setMarks(marks);

		Set jobs = new HashSet();
		jobs.add("software");
		jobs.add("hardware");
		jobs.add("teacher");
		st.setJobs(jobs);

		Map educations = new HashMap();
		educations.put("degree", "B.se");
		educations.put("post-degree", "M.Sc");
		st.setEducation(educations);

		s1.beginTransaction();
		s1.save(st);
		s1.getTransaction().commit();
		s1.close();
		System.out.println("done");

	}
}
