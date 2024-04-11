package com.methodReference;

@FunctionalInterface
interface DoSomething{
	//void printSomething();
	//String changeCase(String str);
	void getObject();
}

class Printable{
	
	public Printable(){
		System.out.println("constructor called");
	}
	public void m1(){
		System.out.println("Hello methodReference");
	}
	
	
	public static void m2(){
		System.out.println("referencing static-method ");
	}
}
public class Test {

	public static void main(String[] args) {
//		Printable obj = new Printable();
//		DoSomething doSomething = obj::m1;
//		doSomething.printSomething();
        
//		DoSomething doSomething = Printable::m2;
//		doSomething.printSomething();
		
//		DoSomething doSomething = String::toUpperCase;
//		System.out.println(doSomething.changeCase("hello java"));
		
//		DoSomething doSomething = String::toLowerCase;
//		System.out.println(doSomething.changeCase("JAVA"));
		
		DoSomething doSomething = Printable::new;
		doSomething.getObject();
				
		
	}

}
