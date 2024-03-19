package com.banking;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		System.out.println("-----Welcome to ABC BANK----");
		Scanner sc = new Scanner(System.in);
		char res;
		int counter=0;
		while(counter<=3){
		System.out.println("Enter the secret key");
		int pin = sc.nextInt();
		if(pin==DB.getPin()){
			do{
			  System.out.println("Select option");
			  System.out.println("1.withdraw   2.deposit    3.balEnquirey");
			   int option = sc.nextInt();
			   switch(option){
			   case 1:System.out.println(BankingOperation.withdraw(600));
			          break;
			          
			   case 2:System.out.println(BankingOperation.deposit(2200));
			          break;
			   case 3:System.out.println(BankingOperation.bal());
			          break;
			   default:System.out.println("Invalid option");
			   }
			   System.out.println("Do you want to continue?y/n");
			    res = sc.next().charAt(0);
			}while(res=='y');
			break;
		}else{
			counter++;
			System.out.println("Incorrect pin");
			if(counter==4){
				System.out.println("Wrong Pin");
				System.out.println("Connect with your nearest branch...");
			}
		}
		
		}
		System.out.println("Thank you for banking with us...");
	}

}
