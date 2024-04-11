package com.multiThreading;

class SharedResource{
	public synchronized void print(int num) throws InterruptedException{
		for(int i=1;i<=10;i++){
			Thread.sleep(1000);
			System.out.println(num+"X"+i+"="+(num*i));
		}
	}
}

class Th1 extends Thread{
	private SharedResource sharedResource;
	Th1(SharedResource sharedResource){
		this.sharedResource = sharedResource;
	}
	
	public void run(){
		try {
			this.sharedResource.print(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


class Th2 extends Thread{
	private SharedResource sharedResource;
	Th2(SharedResource sharedResource){
		this.sharedResource = sharedResource;
	}
	public void run(){
		try {
			this.sharedResource.print(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


public class Test10 {

	public static void main(String[] args) {
		SharedResource obj = new SharedResource();
		SharedResource obj2 = new SharedResource();
		Th1 t = new Th1(obj);
		Th2 t2 = new Th2(obj2);
		
		t.start();
		t2.start();

	}

}
