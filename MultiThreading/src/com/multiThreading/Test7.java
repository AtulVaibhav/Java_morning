package com.multiThreading;

class T3 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}
}
public class Test7 {

	public static void main(String[] args) {
		T3 t= new T3();
		T3 th =new T3();
		
		t.setName("A");
		th.setName("B");
		t.start();
		th.start();

	}

}
