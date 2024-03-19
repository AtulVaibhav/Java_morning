package com.if_else;

public class Test3 {
   public static void getGrade(int marks){
	   if(marks>=80){
		   System.out.println("Distinction");
	   }else if(marks>=60 && marks<80){
		   System.out.println("First class");
	   }else if(marks>=40 && marks<60){
		   System.out.println("Second class");
	   }else{
		   System.out.println("Try Again..");
	   }
   }
	public static void main(String[] args) {
		getGrade(56);
	}

}
