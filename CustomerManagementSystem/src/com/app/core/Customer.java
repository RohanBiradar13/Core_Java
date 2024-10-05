package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class Customer implements Serializable{
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate date;
	private CustomerCategory category;
	private String adharcard;
	public Customer(String name, String email, String password, double registrationAmount, LocalDate date,
			CustomerCategory category, String adharcard) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.date = date;
		this.category = category;
		this.adharcard = adharcard;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", registrationAmount="
				+ registrationAmount + ", date=" + date + ", category=" + category + ", adharcard=" + adharcard + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getRegistrationAmount() {
		return registrationAmount;
	}
	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public CustomerCategory getCategory() {
		return category;
	}
	public void setCategory(CustomerCategory category) {
		this.category = category;
	}
	public String getAdharcard() {
		return adharcard;
	}
	public void setAdharcard(String adharcard) {
		this.adharcard = adharcard;
	}
	
	
}
