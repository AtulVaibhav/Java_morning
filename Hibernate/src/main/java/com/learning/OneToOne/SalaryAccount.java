package com.learning.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SalaryAccount {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int accountId;
   private String accountNumber;
   
   @OneToOne(cascade = CascadeType.ALL)
   private Employee emp;

public SalaryAccount() {
	super();
	// TODO Auto-generated constructor stub
}

public SalaryAccount(String accountNumber, Employee emp) {
	super();
	this.accountNumber = accountNumber;
	this.emp = emp;
}

public int getAccountId() {
	return accountId;
}

public void setAccountId(int accountId) {
	this.accountId = accountId;
}

public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public Employee getEmp() {
	return emp;
}

public void setEmp(Employee emp) {
	this.emp = emp;
}
   
   
}
