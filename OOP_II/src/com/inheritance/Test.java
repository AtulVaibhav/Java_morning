package com.inheritance;

class Parent{
	private int data = 100;
	public int getPrivateData(){
		return this.data;
	}
}
class Child extends Parent{
	
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Child ch = new Child();
      int result = ch.getPrivateData();
      System.out.println(result);
	}

}
