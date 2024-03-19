package com.inheritanceII;

class Employee{
	public String getCompanyName(){
		return "ABC Pvt Ltd";
	}
}

class PartTimeEmployee extends Employee{
	public int getSalary(){
		return 20000;
	}
}

class FulltimeEmployee extends Employee{
	public int getSalary(){
		return 40000;
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
		System.out.println(partTimeEmployee.getCompanyName());
		System.out.println(partTimeEmployee.getSalary());
		System.out.println("-------------------------------------");
		FulltimeEmployee fulltimeEmployee = new FulltimeEmployee();
		System.out.println(fulltimeEmployee.getCompanyName());
		System.out.println(fulltimeEmployee.getSalary());
		

	}

}
