package com.app.org;

public class Worker extends Employee {
 
private int hoursWorked;
 private double hourlyRate;
public Worker(int id, String name, int deptId, double basic, int hoursWorked, double hourlyRate) {
	super(id, name, deptId, basic);
	this.hoursWorked = hoursWorked;
	this.hourlyRate = hourlyRate;
}
@Override
public String toString() {
	return "Worker"+super.toString()+" [hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + "]";
}
@Override
public double computeNetSalaray() {
	return getBasic()+(this.hoursWorked*this.hourlyRate);
}
public double getHourlyRate() {
	return this.hourlyRate;
}
 
 
}
