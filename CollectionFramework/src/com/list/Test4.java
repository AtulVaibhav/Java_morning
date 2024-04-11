package com.list;

import java.util.Stack;

public class Test4 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i=1;i<=10;i++){
			stack.push(i);
		}
		System.out.println(stack);
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
		
		
		

	}

}
