package com.inheritance;


class A{
	int data=10;
	
}

class B extends A{
	int data=20;
	public void m1(){
		int data=30;
		System.out.println(data);
		System.out.println(this.data);
		System.out.println(super.data);
	}
	public void m2(){
		
		System.out.println(data);
		System.out.println(super.data);
	}
}
public class Test4 {
    
    
	public static void main(String[] args) {
		B obj = new B();
		obj.m2();

	}

}
