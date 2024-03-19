package com.if_else;

public class Question3 {
	static int count=0;
   public static int length(int num){
	   while(num>0){
		   count++;
		   num = num/10;
	   }
	   return count;
   }
	public static void main(String[] args) {
	  System.out.println(length(1345));

	}

}
