package com.learning.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int empId;
    private String empName;
    
    @OneToOne(cascade=CascadeType.ALL)
    private SalaryAccount account;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, SalaryAccount account) {
		super();
		this.empName = empName;
		this.account = account;
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
	public SalaryAccount getAccount() {
		return account;
	}
	public void setAccount(SalaryAccount account) {
		this.account = account;
	}
    
    
}
