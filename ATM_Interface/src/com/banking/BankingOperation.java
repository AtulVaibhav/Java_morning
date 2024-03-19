package com.banking;

public class BankingOperation {
    private static final int minBal = 500;
    private static int currentBal = minBal;
    
    
    public static String withdraw(int withdrawAmount){
    	if((currentBal-minBal)>=withdrawAmount){
    		currentBal -= withdrawAmount;
    		return "Amount "+ withdrawAmount+" deducted successfully";
    	}
    	return "Insuffcicent balance";
    }
    
    public static String deposit(int depositAmount){
    	if(depositAmount>=500){
    		currentBal +=depositAmount;
        	return "Amount deposited successfully";
    	}
    	return "Deposit amount should be 500 or more";
    }
    
    
    public static int bal(){
    	return currentBal;
    }
}
