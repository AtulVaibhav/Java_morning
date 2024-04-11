package com.multiThreading;

public class Test15 extends Thread{
    public void run(){
    	System.out.println(Thread.currentThread().isDaemon());
    }
	public static void main(String[] args) {
		Test15 t = new Test15();
		t.setDaemon(true);
		//System.out.println(t.isDaemon());
		t.start();

	}

}
