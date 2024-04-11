package com.multiThreading;

class PrintTable{
	public void print(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+"X"+i+"="+(num*i));
		}
	}
}

class TA extends Thread{
	private PrintTable printTable;
	TA(PrintTable printTable){
		this.printTable = printTable;
	}
	public void run(){
		this.printTable.print(10);
	}
}


class TB extends Thread{
	private PrintTable printTable;
	TB(PrintTable printTable){
		this.printTable = printTable;
	}
	
	public void run(){
		this.printTable.print(20);
	}
}


public class Test8 {

	public static void main(String[] args) {
		PrintTable obj = new PrintTable();
		TA t = new TA(obj);
		TB th = new TB(obj);
		
		t.setPriority(Thread.MAX_PRIORITY);
		th.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println(t.getPriority());
		System.out.println(th.getPriority());
		
		t.start();
		th.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			th.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
