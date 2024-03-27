package com.multiThreading;

public class Test2 extends Thread{
    public void run(){
    	System.out.println("Thread name running run() :"+Thread.currentThread().getName());
		
    	System.out.println("User-thread is running");
    }
	public static void main(String[] args) {
		System.out.println("Thread name running main() :"+Thread.currentThread().getName());
		Test2 test2 = new Test2();
		test2.start();

	}

}
