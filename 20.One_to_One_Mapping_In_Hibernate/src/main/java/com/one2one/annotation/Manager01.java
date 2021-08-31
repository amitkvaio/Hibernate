package com.one2one.annotation;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.Util;

public class Manager01 {
	public static void main(String[] args) {

		Session session = Util.getSession();

		// Begin transaction
		Transaction t = session.beginTransaction();

		 
		Applicant applicant = new Applicant();
		applicant.setName("AmitAnnotation");
		applicant.setAge(30);
		applicant.setCity("Ranchi");

		// Create Passport Model data
		Passport passport = new Passport();
		passport.setPassportNumber("ABCDE1111Z");
		passport.setIssuedDate(new Date());
		Calendar date = Calendar.getInstance();
		date.setTime(new Date());
		date.add(Calendar.YEAR, 10);
		passport.setExpiryDate(date.getTime());

		applicant.setPassport(passport);
		passport.setApplicant(applicant);
		session.persist(applicant);
		/*
		We have created one Applicant and associated a Passport to that Applicant.
		We are persisting only Applicant but both Applicant and Passport will be saved into DB.
		It’s because we have given cascade=save-update in applicant.hbm.xml file.
		*/

		// Commit the transaction and close the session
		t.commit();
		session.close();
		System.out.println("successfully persisted Applicant details");
	}
}
