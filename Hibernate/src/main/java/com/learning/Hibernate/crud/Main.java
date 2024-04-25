package com.learning.Hibernate.crud;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ankit","Dev",67000);
		Employee e2 = new Employee("Harsh","Accounts",57000);
		Employee e3 = new Employee("Varun","Testing",47000);
//		
//		System.out.println(HibernateUtils.addEmployee(e1));
//		System.out.println("_______________________________");
//		System.out.println(HibernateUtils.addEmployee(e2));
//		System.out.println("_______________________________");
//		System.out.println(HibernateUtils.addEmployee(e3));
//		System.out.println("_________________________________");
		
//		System.out.println(HibernateUtils.getEmployeeById(2));
		
		
		//System.out.println(HibernateUtils.getAllEmployee());
//		
//		Employee e4 = new Employee();
//		e4.setEmpId(3);
//		e4.setEmpName("Varun");
//		e4.setEmpDept("HR");
//		e4.setEmpSalary(66000);
//        System.out.println(HibernateUtils.updateEmployee(e4));	
		
		
		System.out.println(HibernateUtils.deleteEmployee(3));
	}

}
