package com.learning.Hibernate.crud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static SessionFactory factory = null;
	private static SessionFactory getSessionFactory(){
		if(factory==null){
			factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.buildSessionFactory();
		}
		return factory;
	}
	
	public static String addEmployee(Employee emp){
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		session.close();
		return "Employee added successfully";
	}
	
	public static Employee getEmployeeById(int empId){
		Session session = getSessionFactory().openSession();
		Employee emp = session.get(Employee.class, empId);
		return emp;
		
	}
	
	
	public static List<Employee> getAllEmployee(){
		String hql = "from Employee";
		Session session  = getSessionFactory().openSession();
		Query<Employee> query = session.createQuery(hql);
		return query.list();
	
	}
	
	public static String updateEmployee(Employee updatedEmp){
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.update(updatedEmp);
		session.getTransaction().commit();
		session.close();
		return "Employee updated successfully";
	}
	
	public static String deleteEmployee(int empId){
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Employee emp = session.get(Employee.class,empId);
		if(emp!=null){
			session.delete(emp);
			session.getTransaction().commit();
			return "Employee deleted successfully";
		}
		return "No employee found";
	}
	
	
	

}
