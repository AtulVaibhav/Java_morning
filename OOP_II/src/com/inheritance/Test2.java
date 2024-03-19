package com.inheritance;

class Parent1{
	Parent1(int a){
		System.out.println("Parent class constructor called");
	}
}

class Child1 extends Parent1{
	Child1(){
		super(10);
		System.out.println("Child class constructor called");
	}
}

public class Test2 {

	public static void main(String[] args) {
     Child1 ch = new Child1();

	}

}
