package com.learning.Hibernate.Association;

import javax.persistence.Embedded;
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
    
    public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Embedded
    private Address address;
	public Employee(String empName, Address address) {
		super();
		this.empName = empName;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	
    
    
}
