package com.multiThreading;

class Resources{
	public static final String resource1 = "pen";
	public static final String resource2 = "paper";
}

class TX extends Thread{
	public void run(){
		synchronized(Resources.resource1){
			System.out.println("Acquired pen. Waiting for paper");
			synchronized (Resources.resource2) {
				System.out.println("Acquired paper.Completed writing task.");
			}
		}
	}
}




class TZ extends Thread{
	public void run(){
		synchronized(Resources.resource2){
			System.out.println("Acquired paper. Waiting for pen");
			synchronized (Resources.resource1) {
				System.out.println("Acquired pen.Completed writing task.");
			}
		}
	}
}


public class Test13 {

	public static void main(String[] args) {
		TX t = new TX();
		TZ t2  = new TZ();
		
		t.start();
		t2.start();

	}

}
