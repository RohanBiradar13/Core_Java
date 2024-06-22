package com.app.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date date;
	private CustomerCategory category;
	private AdharCard adharcard;
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
		StringBuilder sb = new StringBuilder();
		if(adharcard==null) {
			sb.append("Adhar Card not yet linked");
		}
		else {
			sb.append(adharcard);
		}
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", registrationAmount="
				+ registrationAmount + ", date=" + sdf.format(date) + "Customer type "+category+" "+sb.toString();
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
	public void linkAdharCard(String uid, String createdDate)throws ParseException {
		this.adharcard=new AdharCard(uid, sdf.parse(createdDate));
	}
	class AdharCard{
		private String uid;
		private Date createdOn;
		public AdharCard(String uid, Date createdOn) {
			super();
			this.uid = uid;
			this.createdOn = createdOn;
		}
		@Override
		public String toString() {
			return "AdharCard [uid=" + uid + ", createdOn=" + sdf.format(createdOn) + "]";
		}
		
	}
	

}
