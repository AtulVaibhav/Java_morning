package com.accessModifier;

public class Test {
 
	public static void main(String[] args) {
		Data obj = new Data();
		System.out.println(obj.data);
		System.out.println(obj.data2);
        //System.out.println(obj.data3);
		
		Child ch = new Child();
		System.out.println(ch.data4);
	}

}
