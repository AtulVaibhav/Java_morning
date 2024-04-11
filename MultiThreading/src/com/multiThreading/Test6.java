package com.multiThreading;

class T2 extends Thread{
	public void run(int a){
		System.out.println("Thread is running");
	}
}
public class Test6 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		T2 t2 = new T2();
		t2.start();
		

	}

}
