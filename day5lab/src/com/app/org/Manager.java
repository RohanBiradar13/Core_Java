package com.app.org;

public class Manager extends Employee{
 private double performanceBonus;

public Manager(int id, String name, int deptId, double basic, double performanceBonus) {
	super(id, name, deptId, basic);
	this.performanceBonus = performanceBonus;
}

@Override
public String toString() {
	return "Manager"+super.toString()+" [performanceBonus=" + performanceBonus + "]";
}
@Override
public double computeNetSalaray() {
	return getBasic()+performanceBonus;
}
public double getPerformanceBonus() {
	return this.performanceBonus;
}



 
}
