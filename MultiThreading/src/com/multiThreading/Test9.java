package com.multiThreading;


class T_A extends Thread{
	public void run(){
		System.out.println("Child thread starts");
		System.out.println("Child thread terminate");
	}
}

public class Test9 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" started");
        T_A t1 = new T_A();
        
        t1.start();
        try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        
        System.out.println(Thread.currentThread().getName()+" terminated");
	}

}
