package com.exception;
class AgeVerificationFailedException2  extends Exception{
	private String msg;
	public AgeVerificationFailedException2(String msg) {
		this.msg = msg;
	}
	public String getMsg(){
		return this.msg;
	}
}
public class ThrowsKeyword {
   public void m1() throws AgeVerificationFailedException2{
	   throw new AgeVerificationFailedException2("Age verification failed");
   }
   public void n1() throws AgeVerificationFailedException2{
	   this.m1();
   }
	public static void main(String[] args) throws AgeVerificationFailedException2{
			new ThrowsKeyword().n1();
		

	}

}
