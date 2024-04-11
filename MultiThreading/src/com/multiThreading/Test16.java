package com.multiThreading;

class CarInfo{
	
}
public class Test16 {
    protected void finalize(){
    	System.out.println("cleanup process");
    }
	public static void main(String[] args) {
		CarInfo c1 = new CarInfo();
		c1 = null;
		//System.gc();
		Runtime.getRuntime().gc();

	}

}
