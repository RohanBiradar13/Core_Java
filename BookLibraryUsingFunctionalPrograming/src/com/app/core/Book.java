package com.app.core;

import java.time.LocalDate;

public class Book {
	private String isbn;
	private String author;
	private double price;
	private Category categroy;
	private int quantity;
	private LocalDate publishDate;
	public Book(String isbn, String author, double price, Category categroy, int quantity, LocalDate publishDate) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.price = price;
		this.categroy = categroy;
		this.quantity = quantity;
		this.publishDate = publishDate;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", price=" + price + ", categroy=" + categroy
				+ ", quantity=" + quantity + ", publishDate=" + publishDate + "]";
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCategroy() {
		return categroy;
	}
	public void setCategroy(Category categroy) {
		this.categroy = categroy;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public String getAuthor() {
		return author;
	}
	
	
}
