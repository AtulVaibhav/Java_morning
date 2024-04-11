package com.list;

import java.util.LinkedList;

public class Test2 {
     public static void print(LinkedList<Integer> list){
    	 System.out.print("head-->");
    	 for(Integer data:list){
    		 System.out.print(data+"-->");
    	 }
    	 System.out.println("null");
     }
     
     public static void printPrevNode(int index,LinkedList<Integer>list){
    	if(index==0){
    		System.out.println("Already at beginning");
    	}else{
    		System.out.println(list.get(index-1));
    	}
     }
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		System.out.println(linkedList.size());
		
		linkedList.add(10);
		linkedList.add(102);
		linkedList.add(13);
		
		print(linkedList);
		
		//addNode at beginning
		linkedList.addFirst(200);
		print(linkedList);
		
		
		//addNode at given position
		linkedList.add(2, 1000);
		print(linkedList);
		
		
		//add node at end position
		linkedList.addLast(5000);
		print(linkedList);
		
		printPrevNode(0, linkedList);
		
		/*
		//read
		System.out.println(linkedList.peek());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.get(2));
        
        
        //update
        linkedList.set(0, 3000);
        print(linkedList);
        
        
        //remove
        System.out.println(linkedList.poll());
        
        print(linkedList);
        System.out.println(linkedList.peek());
        
        //remove node from first position
        linkedList.pollFirst();
        print(linkedList);
        
        //remove node from given index
        linkedList.remove(2);
        print(linkedList);
        
        //remove node from last position
        linkedList.pollLast();
        print(linkedList);
        */
	}

}
