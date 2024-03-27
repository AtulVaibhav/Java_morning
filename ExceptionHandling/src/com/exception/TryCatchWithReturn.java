package com.exception;

public class TryCatchWithReturn {
    public static int m1(){
    	 try{
    		 String str = null;
    		 System.out.println(str.length());
        	 return 10;
         }catch(Exception ex){
        	 return -1;
         }
    }
	public static void main(String[] args) {
		System.out.println(m1());

	}

}
