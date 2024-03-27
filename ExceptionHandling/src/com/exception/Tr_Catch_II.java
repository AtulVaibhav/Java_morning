package com.exception;

public class Tr_Catch_II {
    public void m1(){
    	String str = null;
    	System.out.println(str.length());
    	try{
    		System.out.println(12/0);
    	}catch(NullPointerException npe){
    		System.out.println("Exception handled successfully");
    	}
    }
	public static void main(String[] args) {
		new Tr_Catch_II().m1();

	}

}
