package in.fundamentals;


class Paper{
	Paper(){
		this(10);
		System.out.println("no-arg constructor called");
	}
	Paper(int i){
		
		System.out.println("parameterized constructor called");
		
	}
}
public class This_II {

	public static void main(String[] args) {
		Paper paper = new Paper();
	}

}
