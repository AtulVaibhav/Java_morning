package com.learning.Hibernate.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int empId;
    private String empName;
    private String empDept;
    private double empSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, String empDept, double empSalary) {
		super();
		this.empName = empName;
		this.empDept = empDept;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSalary=" + empSalary
				+ "]";
	}
    
    
}
