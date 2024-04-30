package com.learning.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
	               .configure("hibernate.cfg.xml")
	               .buildSessionFactory();

       Session session = factory.openSession();
       
       //loading employee object:
       Employee emp= session.get(Employee.class, 1);
       System.out.println(emp.getEmpName()+" "+emp.getAccount().getAccountNumber());
       
       System.out.println("______________________________________");
       SalaryAccount account = session.get(SalaryAccount.class, 1);
       System.out.println(account.getAccountNumber()+" "+account.getEmp().getEmpName());
       
       session.close();

	}

}
