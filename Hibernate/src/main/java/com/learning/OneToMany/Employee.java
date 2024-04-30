package com.learning.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int empId;
    private String empName;
    
    @OneToMany(cascade=CascadeType.ALL,mappedBy="emp")
    private List<Account> accounts;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, List<Account> accounts) {
		super();
		this.empName = empName;
		this.accounts = accounts;
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

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
    
    
    
    
}
