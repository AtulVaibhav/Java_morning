package com.string;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Java";
		//1.length()
		System.out.println(str.length());
		
		//2.charAt(index)
		System.out.println(str.charAt(3));
        
		//3.indexOf(char):first occurrence
		System.out.println(str.indexOf('a'));
		
		//4.lastIndexOf
		System.out.println(str.lastIndexOf('a'));
		
		//5.substring
		System.out.println(str.substring(1));
		System.out.println(str.substring(1,3));//av:1,2
		
		
		//6.concat(String str)
		System.out.println(str.concat("World"));
		
		//7.split
		String str2 = "Java World";
		String[] arr = str2.split(" ");
		System.out.println(Arrays.toString(arr));
		
		
		//8.equals:content
		String str3  = "hello";
		String str4 = "hello";
		System.out.println(str3.equals(str4));
		
		//9.==
		System.out.println(str3==str4);
		
		
		//10.toUpperCase
		System.out.println(str3.toUpperCase());
		
		//11.toLowerCase
		String str5 = "HELLO";
		System.out.println(str5.toLowerCase());
		
		
		//12.toCharArray
		System.out.println(Arrays.toString(str5.toCharArray()));
		
		
		//13.trim
		String str6 = " Java World ";
		System.out.println(str6.trim().length());
		
		
		//14.contains:
		System.out.println(str6.contains("Java"));
		
		//15.replace
		String str7 ="Java J2EE";
		System.out.println(str7.replace('J', 'j'));
		
		
		//16.startsWith
		String str8 = "Akash";
		System.out.println(str8.startsWith("ak"));
		
		//17.endsWith
		System.out.println(str8.endsWith("sh"));
	} 

}

