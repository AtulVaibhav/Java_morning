package com.exception;

public class FinallyBlock {
    public static void m1(){
    	try{
    		String str = null;
    		//System.out.println(str.length());
    	}finally{
    		System.out.println("Finally block executed");
    	}
    }
	public static void main(String[] args) {
		m1();

	}

}
