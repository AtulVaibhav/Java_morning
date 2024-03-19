package in.fundamentals;

class Mobile{
	String brandName;
	int modelNumber;
	
	Mobile(String brandName,int modelNumber){
		this.brandName = brandName;
		this.modelNumber = modelNumber;
	}
	
	public void show(){
		System.out.println(this.brandName+" "+this.modelNumber);
	}
	
	public void display(){
		this.show();
	}
}

public class This_I {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("onePlus",1234);
		m1.show();
	}

}
