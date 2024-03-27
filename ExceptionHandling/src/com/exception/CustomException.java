package com.exception;

class AgeVerificationFailedException  extends Exception{
	private String msg;
	public AgeVerificationFailedException(String msg) {
		this.msg = msg;
	}
	public String getMsg(){
		return this.msg;
	}
}
public class CustomException {
    public void ageVerification(int age){
    	if(age<18){
    		try{
    		throw new AgeVerificationFailedException("Age is less than 18");
    		}catch(AgeVerificationFailedException e){
    			System.out.println(e.getMsg());
    		}
    		}else{
    		System.out.println("Welcome to online voting");
    	}
    }
	public static void main(String[] args) {
		new CustomException().ageVerification(17);		

	}

}
