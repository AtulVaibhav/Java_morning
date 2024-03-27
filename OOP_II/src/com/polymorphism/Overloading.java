package com.polymorphism;

class Dimension{
	public void area(int a){
		System.out.println(Math.PI*a*a);
	}
	
	public void area(float a){
		System.out.println(a*a);
	}
	
	public void area(int length,int breadth){
		System.out.println(length*breadth);
	}
}


public class Overloading {

	public static void main(String[] args) {
		Dimension d = new Dimension();
		d.area(12.25f);

	}
	

}
