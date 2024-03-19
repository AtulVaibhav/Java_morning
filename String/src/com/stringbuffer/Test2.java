package com.stringbuffer;

public class Test2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		//1.append
		sb.append("World");
		System.out.println(sb);
		
		//2.insert
		sb.insert(4, "2EE");
		System.out.println(sb);
		
		//3.replace
		sb.replace(7,sb.length()-1,"Programs" );
		System.out.println(sb);
		
		//4.delete
		sb.delete(7,sb.length());
		System.out.println(sb);
		
		//5.reverse
		System.out.println(sb.reverse());
		
		//6.length()
		System.out.println(sb.length());
		
		//7.indexOf
		System.out.println(sb.indexOf("E"));
		
		//8.charAt
		System.out.println(sb.charAt(1));
		int a=10;
		System.out.println("\""+a+"\"");
	}
}
