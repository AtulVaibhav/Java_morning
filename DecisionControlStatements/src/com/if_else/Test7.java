package com.if_else;

import java.util.Scanner;

public class Test7 {
   public static void add(int a,int b){
	   System.out.println(a+b);
   }
   
   public static void sub(int a,int b){
	   System.out.println(a-b);
   }
   
   public static void mul(int a,int b){
	   System.out.println(a*b);
   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char response;
	   do{
			System.out.println("Select option");
			System.out.println("1.add  2.sub   3.mult");
			int option = sc.nextInt();
			switch(option){
			case 1:add(12,11);
			       break;
			case 2:sub(12,11);
			       break;
			case 3:mul(12,11);
			       break;
			default:System.out.println("Invalid option..Try again");
			}
			System.out.println("Do you want to continue?y/n");
			response = sc.next().charAt(0);//java
	   }while(response=='y');
	   System.out.println("Out of loop");

	}

}
