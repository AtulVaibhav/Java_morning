package com.queue;

import java.util.PriorityQueue;

public class Test1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(111);
		priorityQueue.add(12);
		priorityQueue.add(13);
		priorityQueue.add(1);
		priorityQueue.add(122);
		priorityQueue.add(213);
		priorityQueue.add(102);
		priorityQueue.add(120);
		priorityQueue.add(135);
		
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.peek());
		
		System.out.println(priorityQueue.offer(100));
		//System.out.println(priorityQueue.offer(null));
		
		System.out.println(priorityQueue.remove(1000));
		
		
		PriorityQueue<String> queue = new PriorityQueue<>();
		System.out.println(queue.poll());
		
		
		
		
		
		
	}

}
