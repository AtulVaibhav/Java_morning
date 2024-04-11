package com.list;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test6 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		for(int i=1;i<=5;i++){
			list.add(i*i);
		}
       Iterator<Integer> itr = list.iterator();
       while(itr.hasNext()){
    	   System.out.println(itr.next());
    	   
    	   list.add(32);
       }
	}

}
