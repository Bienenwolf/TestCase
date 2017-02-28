package main;

import org.hibernate.cfg.Configuration;

public class TestClass {
	public TestClass() {
		System.out.println(new Configuration().configure("managedbeans/hibernate.cfg.xml").buildSessionFactory().openSession().createQuery(" from Testdata").list().size());
	}
}
