package com.multiThreading;

class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=2;i++){
			System.out.println("Current running thread:"+Thread.currentThread().getName()+"--->"+i);
		}
	}
}

public class Test4 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();

	}

}
