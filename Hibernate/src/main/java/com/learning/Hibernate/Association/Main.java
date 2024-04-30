package com.learning.Hibernate.Association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Address addr = new Address("Bangalore","Karnataka");
		
		Employee e1 = new Employee("Harsh",addr);
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
                .buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(e1);
		session.getTransaction().commit();
		System.out.println("Object saved successfully");
		
		System.out.println("__________________________________________");
		System.out.println("Loading Employee object");
		Employee savedEmployee = session.get(Employee.class, 1);
		System.out.println(savedEmployee);
		session.close();
		
		
		
		
		
		
		
		
		
		
	}

}
