package com.reservation;

public class Test {

	public static void main(String[] args) {
		TicketBooking ticketBooking = new TicketBooking();
		Passenger p1 = new Passenger("Harsh",5,ticketBooking);
		Passenger p2 = new Passenger("Vinay", 5, ticketBooking);
		p1.start();
		p2.start();

	}

}
