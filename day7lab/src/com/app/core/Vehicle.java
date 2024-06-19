package com.app.core;

public class Vehicle {
	private int registrationNumber;
	private String colour;
	private double price;
	public Vehicle(int registrationNumber, String colour, double price) {
		super();
		this.registrationNumber = registrationNumber;
		this.colour = colour;
		this.price = price;
	}
	
	public Vehicle(int registrationNumber, String colour) {
		super();
		this.registrationNumber = registrationNumber;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [registrationNumber=" + registrationNumber + ", colour=" + colour + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object anotherVehicle) {
		if(anotherVehicle instanceof Vehicle) {
			System.out.println("in vehicle's equal method");
			Vehicle v = ((Vehicle)anotherVehicle);
			return this.registrationNumber==v.registrationNumber && this.colour.equals(v.colour);
		}
		return false;
		
	}
	



	
	

}
