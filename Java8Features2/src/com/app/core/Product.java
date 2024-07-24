package com.app.core;

import java.time.LocalDate;

public class Product {
	private int id;
	private String name;
	private Category productCategory;
	private LocalDate manufactureDate;
	private double price;
	public Product(int id, String name, Category productCategory, LocalDate manufactureDate, double price) {
		super();
		this.id = id;
		this.name = name;
		this.productCategory = productCategory;
		this.manufactureDate = manufactureDate;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", productCategory=" + productCategory + ", manufactureDate="
				+ manufactureDate + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}

	
}
