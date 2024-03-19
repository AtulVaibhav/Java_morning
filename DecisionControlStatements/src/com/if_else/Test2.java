package com.if_else;

import java.util.Scanner;

class Db{
	private static final int username=1234;
	private static final int password = 6789;
	public static int getUsername(){
		return username;
	}
	public static int getPassword(){
		return password;
	}
}
public class Test2 {
   public static void loginSystem(){
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter username");
	  int user = sc.nextInt();
	  if(user==Db.getUsername()){
		  System.out.println("Enter password");
		  int pass = sc.nextInt();
		  if(pass==Db.getPassword()){
			  System.out.println("Welcome "+user);
		  }else{
			  System.out.println("Invalid password");
		  }
	  }else{
		  System.out.println("Invalid username");
	  }
   }
	public static void main(String[] args) {
		loginSystem();

	}

}
