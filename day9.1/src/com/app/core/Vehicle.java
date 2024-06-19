package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
	private int registrationNumber;
	private String colour;
	private double price;
	private Date manufactureDate;
	private VehicleType type;
	public static SimpleDateFormat sdf;
	static {
		sdf =new SimpleDateFormat("dd-MM-yyyy");
	}
	public Vehicle(int registrationNumber, String colour, double price, Date manufactureDate, VehicleType type) {
		super();
		this.registrationNumber = registrationNumber;
		this.colour = colour;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Vehicle [registrationNumber=" + registrationNumber + ", colour=" + colour + ", price=" + price
				+ ", manufactureDate=" + sdf.format(manufactureDate) + ", type=" + type + "]";
	}
	@Override
	public boolean equals(Object anotherVehicle) {
		System.out.println("vehicles equation");
		if(anotherVehicle instanceof Vehicle) {
			Vehicle v=(Vehicle)anotherVehicle;
			return this.registrationNumber==v.registrationNumber && this.colour.equals(v.colour);
		}
		return false;
	}
	
	

}
