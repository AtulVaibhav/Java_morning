package com.abstraction;

interface Vehicle{
	
	int data=20;
	 void m1();
	 public default void m2(){
		 System.out.println("m2() called");
	 }
	 
	 public static void m3(){
		 System.out.println("m3() called");
	 }
}


class FourWheeler implements Vehicle{
	public void m1(){
		System.out.println("m1() called");
	}
}

public class Test2 {

	public static void main(String[] args) {
		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.m1();
		fourWheeler.m2();
		//fourWheeler.m3();
		Vehicle.m3();
		System.out.println(Vehicle.data);
		//Vehicle.data=300;

	}

}
