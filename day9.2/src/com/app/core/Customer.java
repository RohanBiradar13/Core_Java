package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date date;
	public CustomerCategory category;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	
	public Customer(String name, String email, String password, double registrationAmount, Date date,CustomerCategory category) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.date = date;
		this.category=category;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", registrationAmount="
				+ registrationAmount + ", date=" + sdf.format(date) + "Customer type "+category+"]";
	}
	
	@Override
	public boolean equals(Object anotherCustomer) {
		if(anotherCustomer instanceof Customer) {
			System.out.println("in equals method");
			Customer c = ((Customer)anotherCustomer);
			return this.email.equals(c.email);
		}
		return false;
	}
	

}
