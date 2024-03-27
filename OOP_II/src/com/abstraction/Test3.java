package com.abstraction;

interface Network{
	String getNetwork();
}

class Airtel implements Network{

	@Override
	public String getNetwork() {
		// TODO Auto-generated method stub
		return "Airtel";
	}
	
}

class Jio implements Network{

	@Override
	public String getNetwork() {
		// TODO Auto-generated method stub
		return "Jio";
	}
	
}

class Idea implements Network{

	@Override
	public String getNetwork() {
		// TODO Auto-generated method stub
		return "Idea";
	}
	
}

class Sim{
	private Network network;
	Sim(Network network){
		this.network = network;
	}
	public String getName(){
		return this.network.getNetwork();
	}
}

public class Test3 {

	public static void main(String[] args) {
		Sim sim = new Sim(new Idea());
		System.out.println(sim.getName());

	}

}
