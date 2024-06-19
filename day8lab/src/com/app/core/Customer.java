package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date dob;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-YY");
	}
	public Customer(String name, String email, String password, double registrationAmount, Date dob) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
	}
	public Customer(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", registrationAmount="
				+ registrationAmount + ", dob=" +sdf.format(dob) + "]";
	}
	

	

	

}
