package com.app.core;

import java.time.LocalDate;

import customException.AccountHandlyingException;

import static utils.AccountValidation.*;
public class BankAccount {
   
	private int accountNo;
	private String name;
	private Account type;
	private double balance;
	private LocalDate date;
	public BankAccount(int accountNo, String name, Account type, double balance, LocalDate date) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.type = type;
		this.balance = balance;
		this.date = date;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", name=" + name + ", type=" + type + ", balance=" + balance
				+ ", date=" + date + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getType() {
		return type;
	}
	public void setType(Account type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getAccountNo() {
		return accountNo;
	}
	
	public void withDraw(double amount) {
		
		balance-=amount;
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	public void transferFunds(BankAccount destination, double amount) throws AccountHandlyingException {
		//withdraw from source
		this.withDraw(amount);
	    //deposit
		validationAmount(balance-amount);
		destination.deposit(amount);
		
	}
	public void simpleInterest(double interestRate, int periodInYears) {
		double simpleInterest = (this.balance* interestRate * periodInYears)/100;
		deposit(simpleInterest);
	}
}
