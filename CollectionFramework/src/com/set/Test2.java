package com.set;

import java.util.LinkedHashSet;

public class Test2 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(21);
		linkedHashSet.add(1);
		linkedHashSet.add(31);
		linkedHashSet.add(11);
		
		System.out.println(linkedHashSet);
		
		linkedHashSet.add(21);
		System.out.println(linkedHashSet);
		
		linkedHashSet.add(null);
		System.out.println(linkedHashSet);
		
		
		

	}

}
