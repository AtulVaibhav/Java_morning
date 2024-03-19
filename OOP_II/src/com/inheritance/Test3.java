package com.inheritance;


class Base{
	public void m1(){
		System.out.println("Called from base class");
	}
}

class Derived extends Base{
	public void m1(){
		super.m1();
		System.out.println("Called from child class");
	}
}
public class Test3 {

	public static void main(String[] args) {
		Derived derived = new Derived();
		derived.m1();

	}

}
