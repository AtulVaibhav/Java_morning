package com.multiThreading;


class SR{
	public void m1(int num){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+"--> Hello");
		}
		synchronized (this) {
			System.out.println("_________________________________________");
			System.out.println(Thread.currentThread().getName()+" started");
			for(int i=1;i<=5;i++){
				System.out.println(num+" X "+i+" = "+(num*i));
			}
			System.out.println(Thread.currentThread().getName()+" finished");
			System.out.println("_________________________________________");
			
		}
		
	}
}


class T_1A extends Thread{
	private SR sr;
	T_1A(SR sr){
		this.sr = sr;
	}
	
	public void run(){
		this.sr.m1(2);
	}
}

class T_2A extends Thread{
	private SR sr;
	T_2A(SR sr){
		this.sr = sr;
	}
	
	public void run(){
		this.sr.m1(11);
	}
}


public class Test11 {

	public static void main(String[] args) {
		SR sr = new SR();
		T_1A t = new T_1A(sr);
		T_2A t2 = new T_2A(sr);
		
		t.setName("A");
		t2.setName("B");
		
		
		t.start();
		t2.start();

	}

}
