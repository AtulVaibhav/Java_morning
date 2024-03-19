package in.fundamentals;

class Car_data{
	String registrationNumber;
	String modelNumber;
	String userName;
	
	Car_data(String registrationNo, String model,String name){
		registrationNumber = registrationNo;
		modelNumber = model;
		userName = name;
	}
	
	Car_data(Car_data obj){
		registrationNumber = obj.registrationNumber;
		modelNumber = obj.modelNumber;
		userName = obj.userName;
	}
	
	
	public void show(){
		System.out.println("RegistrationNumber :"+registrationNumber);
		System.out.println("ModelNumber        :"+modelNumber);
		System.out.println("UserName           :"+userName);
	}
	
}



public class Constructor_III {

	public static void main(String[] args) {
		Car_data car = new Car_data("123efg","car-123","Harsh");
		car.show();
		car.registrationNumber = "567fgh";
		
		Car_data car2 = new Car_data(car);
        car2.show();
	}

}
