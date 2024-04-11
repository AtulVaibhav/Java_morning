package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(11);
		hashSet.add(1);
		hashSet.add(21);
		hashSet.add(2);
		
		System.out.println(hashSet);
		
		hashSet.add(2);
		System.out.println(hashSet);
        
		hashSet.add(null);
		System.out.println(hashSet);
		
		System.out.println(hashSet.contains(21));
		
		Iterator<Integer> itr = hashSet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
