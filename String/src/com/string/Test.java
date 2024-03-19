package com.string;

public class Test {

	public static void main(String[] args) {
		String str = "Java";
		String str1 = new String("1234");
		System.out.println("Before calling intern()");
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
//		str1 = str1.intern();
//		System.out.println("After calling intern()");
//		System.out.println(str.hashCode());
//		System.out.println(str1.hashCode());
		if(str==str1){
			System.out.println("Points to same location");
		}else{
			System.out.println("Points to different location");
		}
	}

}
