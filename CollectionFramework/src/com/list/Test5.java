package com.list;

import java.util.Iterator;
import java.util.Vector;

public class Test5 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.addElement(11);
		vector.addElement(12);
		vector.addElement(13);
		
		Iterator<Integer> itr = vector.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());	
		}
		vector.addElement(14);
		System.out.println(vector);

	}

}
