package com.polymorphism;


class Parent{
	int a=10;
	public int m1(int a,int b){
		return a+b;
	}
}

class Child extends Parent{
	int a=20;
	@Override
	public int m1(int a,int b){
		return a*b;
	}
}
public class Overriding {

	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.m1(10,20));
		
		
		Parent p = new Parent();
		System.out.println(p.a);
		System.out.println(p.m1(10,20));
		
		
		Parent p1 = new Child();
		System.out.println(p1.a);
		System.out.println(p1.m1(10, 10));

	}

}
