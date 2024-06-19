package com.app.vehicles;

public class Vehicle {
	private int registrationNo;
	private String colour;
	private double price;
	public Vehicle(int registrationNo, String colour, double price) {
		super();
		this.registrationNo = registrationNo;
		this.colour = colour;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [registrationNo=" + registrationNo + ", colour=" + colour + ", price=" + price + "]";
	}
	public boolean checkEquals(Vehicle anotherVehicle) {
		return this.registrationNo==anotherVehicle.registrationNo;
	}
    //this below is Object equals method
	@Override
	public boolean equals(Object anotherVehicle) {
		if(anotherVehicle instanceof Vehicle) {	
			return this.registrationNo==((Vehicle)anotherVehicle).registrationNo;
		
		}else {
			return false;
		}
		
	}
}
