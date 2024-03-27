package com.exception;

class A{
	public void m1(){
		try{
//	     	String str = "123efg";
//	     	System.out.println(Integer.parseInt(str));
//	     	System.out.println("Hello");
			
			String str = null;
			System.out.println(str.length());
		}catch(NumberFormatException nfe){
			System.out.println("Can't convert string to integer");
		}
		System.out.println("Inside method");
	}
}


public class Try_Catch_I {

	public static void main(String[] args) {
		A a = new A();
		a.m1();

	}

}
