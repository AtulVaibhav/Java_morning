package com.string;

public class ImmutableString {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str);
		System.out.println("Before re-assignment :"+str.hashCode());
		
		str.concat("World");
		System.out.println(str);
		
		System.out.println(str + "Java"); 
		System.out.println("Using + operator :"+str.hashCode());
		
		System.out.println(str.concat("Course").hashCode());
		System.out.println("Using concat operator :"+str.hashCode());
		str = str.concat("World");
		System.out.println(str);
		System.out.println("After re-assignment :"+str.hashCode());
	}

}
