package in.fundamentals;

public class Method_I {
   
	public static void m1(){
		System.out.println("static method executed");
		
	}
	
	public void m2(){
		System.out.println("non-static method executed");
		return;
	}
	
	public int m3(){
		m4();
		return 10;
	}
	public void m4(){
		System.out.println("Hello");
	}
	
	
	
	
	public static void main(String[] args) {
		Method_I.m1();
		
		Method_I obj = new Method_I();
		obj.m2();
		
		System.out.println(obj.m3());

	}

}
