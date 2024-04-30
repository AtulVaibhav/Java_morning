package com.learning.OneToMany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Employee  e1=new Employee();
		e1.setEmpName("Harsh");
		
		Employee  e2=new Employee();
		e2.setEmpName("Aman");
		
		
		Account a1 =new Account();
		a1.setAccountNumber("SBI-1234");
		

		Account a2 =new Account();
		a2.setAccountNumber("PNB-1234");
		

		Account a3 =new Account();
		a3.setAccountNumber("SBI-5678");

		Account a4 =new Account();
		a4.setAccountNumber("PNB-5678");
		
		
		List<Account> list1  =Arrays.asList(a1,a2);
		List<Account> list2 = Arrays.asList(a3,a4);
		
		e1.setAccounts(list1);
		e2.setAccounts(list2);
	    
		
		a1.setEmp(e1);
		a2.setEmp(e1);
		
		a3.setEmp(e2);
		a4.setEmp(e2);
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				                 .buildSessionFactory();
		
		Session session= factory.openSession();
		
		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.getTransaction().commit();
		session.close();
		
		
		

	}

}
