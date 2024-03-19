package com.inheritanceII;

class Vehicle{
	public void aveargeSpeed(){
		System.out.println("120km/hr");
	}
}

class FourWheeler extends Vehicle{
	public void numberOfWheels(){
		System.out.println("4");
	}
}

class Car extends FourWheeler{
	public void engineType(){
		System.out.println("Petrol-engine");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Car car = new Car();
		car.aveargeSpeed();
		car.numberOfWheels();
		car.engineType();

	}

}
