package com.exception;

public class FinallyWithReturn {
   public static int m1(){
	   try{
		   String str=null;
		   System.out.println(str.length());
		   return 10;
	   }catch(Exception e){
		   return -1;
	   }finally{
		   return 2;
	   }
   }
	public static void main(String[] args) {
		System.out.println(m1());

	}

}
