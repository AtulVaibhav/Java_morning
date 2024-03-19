package com.if_else;

public class Question_1 {
   public static int checkOdd(int num){
	   if(num%2==1){
		   return 0;
	   }
	   return -1;
   }
	public static void main(String[] args) {
		int num = 53;
		int result = checkOdd(num);
		if(result==0){
			System.out.println(num+" is an odd number");
		}else{
			System.out.println(num+" is an even number");
		}
	}

}
