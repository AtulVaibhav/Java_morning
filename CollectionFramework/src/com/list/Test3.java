package com.list;

import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		System.out.println(vector.capacity());
		
		vector.addElement(1);
		vector.addElement(21);
		vector.addElement(11);
		vector.addElement(1);
		vector.addElement(21);
		vector.addElement(11);
		vector.addElement(1);
		vector.addElement(21);
		vector.addElement(11);
		vector.addElement(1);
		vector.addElement(21);
		vector.addElement(11);
		System.out.println(vector.capacity());
		
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		
		
		System.out.println(vector.contains(11));
		System.out.println(vector.size());
		
		System.out.println("____________________________");
		System.out.println(vector);
		//removeIf
		for(int i=0;i<vector.size();i++){
			vector.removeIf(x->x==11);
			
		}
		System.out.println(vector);
		
	}

}
