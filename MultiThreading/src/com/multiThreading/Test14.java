package com.multiThreading;

class Account{
	
	static int amount = 1000;
	
	public synchronized void withdraw(int withdrawAmount) throws InterruptedException{
		System.out.println("Start withdrawing....");
		
		if(withdrawAmount>amount){
			System.out.println("Insufficient amount..Waitng for deposit");
			wait();
		}
		System.out.println("Amount withdrawn successfully");
	}
	
	public synchronized void deposit(int depositAmount){
		System.out.println("Start depositing...");
		amount = amount+depositAmount;
		System.out.println("Amount deposited successfully");
		notify();
	}
}

class Friend1 extends Thread{
	private Account account;
	Friend1(Account account){
		this.account = account;
	}
	public void run(){
		try {
			this.account.withdraw(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Friend2 extends Thread{
	private Account account;
	Friend2(Account account){
		this.account = account;
	}
	public void run(){
			this.account.deposit(1000);
		
	}
}


public class Test14 {

	public static void main(String[] args) {
		Account account = new Account();
		Friend1 f1 = new Friend1(account);
		Friend2 f2 = new Friend2(account);
		f1.start();
		f2.start();
	}

}
