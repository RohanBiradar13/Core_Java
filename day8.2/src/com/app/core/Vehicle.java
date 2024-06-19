package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {
	private int registrationNumber;
	private String colour;
	private double price;
	private Date manufacureDate;

	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-yy");
	}
	public Vehicle(int registrationNumber, String colour, double price, Date manufacureDate) {
		super();
		this.registrationNumber = registrationNumber;
		this.colour = colour;
		this.price = price;
		this.manufacureDate = manufacureDate;
	}
	@Override
	public String toString() {
		return "Vehicle [registrationNumber=" + registrationNumber + ", colour=" + colour + ", price=" + price
				+ ", manufacureDate=" + sdf.format(manufacureDate) + "]";
	}
	@Override
	public boolean equals(Object anotherObj) {
		if(anotherObj instanceof Vehicle) {
			Vehicle v = ((Vehicle)anotherObj);
			return this.registrationNumber==v.registrationNumber && this.colour==v.colour;
		}
		return false;
	}
	
}
