package com.multiThreading;

public class Test3 implements Runnable{
	public void run(){
    System.out.println("Thread name running run() :"+Thread.currentThread().getName());
		
    System.out.println("User-thread is running");
	}

	public static void main(String[] args) {
		Test3 t = new Test3();
		Thread th = new Thread(t);
		th.start();
		

	}

}
