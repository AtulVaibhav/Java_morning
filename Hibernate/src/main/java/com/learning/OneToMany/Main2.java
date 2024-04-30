package com.learning.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				                 .buildSessionFactory();
		
		Session session= factory.openSession();
		
		Employee emp = session.get(Employee.class,1);
		System.out.println(emp.getEmpName()+" "+emp.getAccounts().get(0).getAccountNumber());
		System.out.println(emp.getEmpName()+" "+emp.getAccounts().get(1).getAccountNumber());

		
		System.out.println("_____________________________________");
		Account account = session.get(Account.class, 1);
		System.out.println(account.getAccountNumber()+" "+account.getEmp().getEmpName());
		
		
		
		
		
		
	}

}
