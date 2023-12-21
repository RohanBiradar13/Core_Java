package com.code;

public class Vehicle {
private String chasisNo;
private String color;
private double price;
public Vehicle(String chasisNo, String color, double price) {
	super();
	this.chasisNo = chasisNo;
	this.color = color;
	this.price = price;
}

public Vehicle(String chasisNo) {
	super();
	this.chasisNo = chasisNo;
}

@Override
public String toString() {
	return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + "]";
}
@Override
public boolean equals(Object o) {
	System.out.println("in vehicle equals..");
	if(o instanceof Vehicle) {
		Vehicle v = (Vehicle) o;
		return this.chasisNo.equals(v.chasisNo);
	}
	return false;
}
}
