package com.string;

public class StringCreation_I {

	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "Hello";
		
		if(str==str1){
			System.out.println(str.hashCode()+" "+str1.hashCode());
			System.out.println("Points to same object");
		}else{
			System.out.println("Points to different objects");
		}
		
		String str2 = "hello";
		if(str==str2){
			System.out.println(str.hashCode()+" "+str2.hashCode());
			System.out.println("Points to same object");
		}else{
			System.out.println("Points to different objects");
		}
		
		
		
	}

}
