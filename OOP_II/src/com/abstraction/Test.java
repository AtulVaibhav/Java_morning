package com.abstraction;

abstract class Car{
	public void engineType(){
		System.out.println("Petrol-Engine");
	}
	Car(){
		System.out.println("Abstract class constructor");
	}
	public abstract void speed();
}

class Lamborgini extends Car{
	  public void speed(){
		  System.out.println("230km/hr");
	  }
}

public class Test {

	public static void main(String[] args) {
		Car c = new Lamborgini();
        c.speed();
	}

}
