package com.reservation;

public class TicketBooking {
	static int availableSeats = 10;
    public synchronized void booking(String name,int requestedSeats){
    	System.out.println("-----Welcome to Reservation System--------");
    	System.out.println("Hello "+name+".You have requested for "+requestedSeats+" seats");
    	System.out.println("Checking for availability...Please wait..");
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	if(requestedSeats<=availableSeats){
    		availableSeats = availableSeats-requestedSeats;
    		System.out.println("Hello "+name+". "+requestedSeats+" seats reserved successfully.");
    	}else{
    		System.out.println("Hello "+name+ " seats not available.");
    	}
    	System.out.println("________________________________________________________");
    }
}
