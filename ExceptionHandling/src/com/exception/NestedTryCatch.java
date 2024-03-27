package com.exception;

public class NestedTryCatch {
    public static void m1(){
    	try{
    		System.out.println("Inside outer try-block");
    		String str = null;
    	//	System.out.println(str.length());
    		try{
    			System.out.println("Inside inner try-block");
    			int[] arr = {1,2,3};
    			System.out.println(arr[4]);
    		}catch(NullPointerException npe){
    			System.out.println("Exception handled by inner catch-block");
    		}
    	}catch(ArrayIndexOutOfBoundsException ex){
    		System.out.println("Exception handled by outer catch-block");
    	}
    }
	public static void main(String[] args) {
		m1();

	}

}
