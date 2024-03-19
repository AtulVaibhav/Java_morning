package com.stringbuffer;

public class Test {

	public static void main(String[] args) {
		//StringBuffer is mutable
		StringBuffer sb = new StringBuffer("javaj2ee");
		System.out.println(sb.capacity());
		System.out.println(sb.hashCode());
		sb.append("world");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		System.out.println("_______________________________");
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());
        sb2.append("abcdefghijklnopqr");
        System.out.println(sb2.capacity());
	}

}
