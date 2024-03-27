package com.exception;

public class Test {
    public void checkedException(){
    	//Class.forName("com.mysql.cj.jdbc.Driver");
    	//DriverManager.getConnection("","","");
    }
    
    //related to logic
    public void uncheckedException(){
    	//ArithmeticException
    	int a = 12/0;
    	System.out.println(a);
    	System.out.println("Inside uncheckedException() method");
    }
	public static void main(String[] args) {
		new Test().uncheckedException();

	}

}
