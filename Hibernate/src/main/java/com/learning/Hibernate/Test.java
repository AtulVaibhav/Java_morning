package com.learning.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setBoxName("box1");
		b1.setBoxPrice(12000);
		b1.setBoxDesc("Aazing box");
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml")
				                .buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
	    session.save(b1);
	    session.getTransaction().commit();
	    session.close();
	    System.out.println("object saved successfully");
		

	}

}
