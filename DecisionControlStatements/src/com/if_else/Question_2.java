package com.if_else;

public class Question_2 {
    public static boolean isPrime(int num){
    	boolean result=true;
    	for(int i=2;i<=num/2;i++){
    		if(num%i==0){
    			result=false;
    			break;
    		}
    	}
    	return result;
    }
	public static void main(String[] args) {
		System.out.println(isPrime(6));
	}

}
