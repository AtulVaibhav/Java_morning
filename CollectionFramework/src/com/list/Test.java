package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		//isEmpty
		System.out.println(list.isEmpty());
		
		//insert
		list.add(11);
		list.add(12);
		list.add(9);
		list.add(11);
		//list.add("hello");
		System.out.println(list);
		System.out.println(list.size());
		
		//fetching single object:
		System.out.println(list.get(0));
		
		//update:
		list.set(0, 101);
		System.out.println(list);
		
		//traversal:
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"  ");
		}
		System.out.println();
		
		for(Integer obj:list){
			System.out.print(obj+" ");
		}
		System.out.println();
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		//remove
		list.remove(0);
		System.out.println(list);
        System.out.println(list.size());
	}

}
