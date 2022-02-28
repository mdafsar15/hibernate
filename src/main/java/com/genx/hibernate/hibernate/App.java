package com.genx.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate.....");

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Student s = new Student();

		s.setId(1);
		s.setName("Yukti");
		s.setCity("Mumbai");

		System.out.println(s.getName());

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(s);

		tx.commit();

		session.clear();
		factory.close();
	}
}
