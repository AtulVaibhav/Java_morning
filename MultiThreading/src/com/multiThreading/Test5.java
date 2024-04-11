package com.multiThreading;


class T1 extends Thread{
	public void run(){
		System.out.println("Thread is running");
	}
}
public class Test5 {

	public static void main(String[] args) {
		T1 obj = new T1();
		obj.start();
		obj.start();

	}

}
