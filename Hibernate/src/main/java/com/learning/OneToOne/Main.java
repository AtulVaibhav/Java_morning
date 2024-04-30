package com.learning.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpName("Harsh");
		
		
		SalaryAccount a1 = new SalaryAccount();
		a1.setAccountNumber("SBI121134");
		
		
		e1.setAccount(a1);
		a1.setEmp(e1);
		
		
		Employee e2 = new Employee();
		e2.setEmpName("Amit");
		
		SalaryAccount a2 = new SalaryAccount();
		a2.setAccountNumber("PNB343437");
        
		e2.setAccount(a2);
		a2.setEmp(e2);
		
		
		SessionFactory factory = new Configuration()
				               .configure("hibernate.cfg.xml")
				               .buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.getTransaction().commit();
		System.out.println("Employee added successfully");
		session.close();
		
		
	}

}
