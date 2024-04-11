package com.reservation;

public class Passenger extends Thread{
     private String passengerName;
     private int requestedSeats;
     private TicketBooking ticketBooking;
     
     Passenger(String name,int seats,TicketBooking ticketBooking){
    	 this.passengerName = name;
    	 this.requestedSeats = seats;
    	 this.ticketBooking = ticketBooking;	 
    	 
     }
     
     public void run(){
    	 this.ticketBooking.booking(this.passengerName,this.requestedSeats);
     }
}
