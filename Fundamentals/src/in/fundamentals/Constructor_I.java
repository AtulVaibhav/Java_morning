package in.fundamentals;

class Car{
	Car(){
		System.out.println("Car object created");
	}
}

public class Constructor_I {
 
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.hashCode());
	}

}
