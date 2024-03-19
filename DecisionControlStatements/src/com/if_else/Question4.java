package com.if_else;

public class Question4 {
    public static boolean isArmStrong(int num){
    	int temp=num;
    	int sum=0;
    	int n=getLength(num);
    	while(num>0){
    		int rem = num%10;
    		num = num/10;
    		sum +=getPower(rem,n);
    	}
    	if(sum==temp){
    		return true;
    	}
    	return false;
    }
    private static int getPower(int rem, int n) {
    	int result=1;
		for(int i=1;i<=n;i++){
			result *= rem; 
		}
		return result;
	}
	private static int getLength(int num){
        int count=0;
    	while(num>0){
    		count++;
    		num = num/10;
    	}
    	return count;
    }
	public static void main(String[] args) {
		System.out.println(isArmStrong(1634));

	}

}
