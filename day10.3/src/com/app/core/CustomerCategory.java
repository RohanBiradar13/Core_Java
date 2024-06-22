package com.app.core;

import java.util.Arrays;

public enum CustomerCategory {
	//compiler provided code of enum class
	//default->//public static final CustomerCategory SILVER= new CustomerCategory();
	//Parameterized->//public static final CustomerCategory SILVER= new CustomerCategory(charges,services);
	/*public final class CustomerCategory extends Enum{
	public CustomerCategory(String s, int i,double charges, String servises[] {)
	super(s,i);
	this.charges=charges;
	this.services=servises;
	}
	public static final CustomerCategory GOLD;
	public static final CustomerCategory DIAMOND;
	public static final CustomerCategory PLATINUM;
	
	static{
	SILVER= new CustomerCategory("SILVER,0,500D,new STring[]{"Platform"});
	GOLD= new CustomerCategory("SILVER,0,500D,new STring[]{"Platform, Web Server"});
	DIAMOND= new CustomerCategory("SILVER,0,500D,new STring[]{"Platform, Web Server, App Deployment"});
		PLATINUM= new CustomerCategory("SILVER,0,500D,new STring[]{"Platform, Web Server, App Deployment,Docker"});
	}
	*/
	SILVER(500,new String[] {"Platform"}), 
	GOLD(1000,new String[] {"Platform, Web Server"}), 
	DIAMOND(1500,new String[] {"Platform, Web Server, App Deployment"}), 
	PLATINUM(1500,new String[] {"Platform, Web Server, App Deployment, Docker"});

//additional state 
	private double charges;
	private String[] services;
//add own parameterized constructor to init additional state
	private CustomerCategory(double charges, String[] services) {
		//super(name, ordinal)
		this.charges=charges;
		this.services=services;
	}
	//for later validations:supply getters
	public double getCharges() {
		return charges;
	}
	public String[] getServices() {
		return services;
	}
	@Override
	public String toString() {
		return name()+"charges :"+charges+"Services "+Arrays.toString(services)
;	}
}
