package com.set;

import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(21);
		treeSet.add(12);
		treeSet.add(1);
		treeSet.add(22);
		
		System.out.println(treeSet);
		
		treeSet.add(22);
		System.out.println(treeSet);
		
		
		//treeSet.add(null);
		System.out.println(treeSet);
		
		

	}

}
