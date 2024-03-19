package com.inheritanceII;


class Parent{
	int data=10;
	public int data2=20;
	private int data3 = 30;
	protected int data4 = 40;
}

class Child extends Parent{
	public void show(){
		System.out.println(data);
		System.out.println(data2);
		System.out.println(data4);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.show();

	}

}
