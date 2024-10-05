package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Vehicle implements Comparable<Vehicle>,Serializable {
	private String chasisNo;
	private String colour;
	private LocalDate manufactureDate;
	private VehicleType type;
	private String companyName;

	public Vehicle(String chasisNo, String colour, LocalDate manufactureDate, VehicleType type, String companyName) {
		super();
		this.chasisNo = chasisNo;
		this.colour = colour;
		this.manufactureDate = manufactureDate;
		this.type = type;
		this.companyName = companyName;
	}

	public Vehicle(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", colour=" + colour + ", manufactureDate=" + manufactureDate
				+ ", type=" + type + ", companyName=" + companyName + "]";
	}

	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public boolean equals(Object anotherVehicle) {
		if (anotherVehicle instanceof Vehicle) {
			Vehicle v = ((Vehicle) anotherVehicle);
			return this.chasisNo.equals(v.chasisNo);
		}
		return false;
	}

	@Override
	public int compareTo(Vehicle anoherVehicle) {
		return this.chasisNo.compareTo(anoherVehicle.chasisNo);
	}

}
