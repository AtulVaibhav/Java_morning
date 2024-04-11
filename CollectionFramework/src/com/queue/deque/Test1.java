package com.queue.deque;

import java.util.ArrayDeque;

public class Test1 {

	public static void main(String[] args) {
		ArrayDeque<Integer>  deque = new ArrayDeque<>();
		
		deque.add(12);
		deque.add(10);
		deque.add(11);
		System.out.println(deque);
		
		deque.addFirst(1);
		System.out.println(deque);
		
		deque.addLast(100);
		System.out.println(deque);
		
		
		System.out.println(deque.peek());
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		
		
		System.out.println(deque.poll());
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollLast());
		
		
		
		
		
		
		
		
		
		
		

	}

}
