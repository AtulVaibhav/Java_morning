package com.multiThreading;

class Resource{
	public static synchronized void m1(){
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}
}

class FirstThread extends Thread{
	private Resource resource;
	
	public FirstThread(Resource resource) {
		this.resource = resource;
	}
	public void run(){
		this.resource.m1();
	}
}

class SecondThread extends Thread{
	private Resource resource;
	public SecondThread(Resource resource) {
		this.resource = resource;
	}
	public void run(){
		this.resource.m1();
	}
}
public class Test12 {

	public static void main(String[] args) {
		
		Resource resource  = new Resource();
		Resource resource2 = new Resource();
		FirstThread firstThread = new FirstThread(resource);
		SecondThread secondThread = new SecondThread(resource2);
		
		firstThread.setName("firstThread");
		secondThread.setName("secondThread");
		firstThread.start();
		secondThread.start();

	}

}
