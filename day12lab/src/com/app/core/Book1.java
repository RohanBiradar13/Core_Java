package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book1 {
	private int isbn;
	private String author;
	private double price;
	private Category category;
	private int quantity;
	private Date date;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Book1(int isbn) {
		super();
		this.isbn = isbn;
	}

	public Book1(int isbn, String author, double price, Category category, int quantity, Date date) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", price=" + price + ", category=" + category
				+ ", quantity=" + quantity + ", date=" + sdf.format(date) + "]";
	}

	@Override
	public boolean equals(Object anotherBook) {
		System.out.println("in equals method");
		if (anotherBook instanceof Book1) {
			Book1 b = ((Book1) anotherBook);
			return this.isbn == b.isbn;
		}
		return false;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}

	/*
	 * @Override public int compareTo(Book anotherBook) {
	 * System.out.println("in compareTo"); // sorting criteria : title if (this.isbn
	 * < anotherBook.isbn) return -1; if (this.isbn == anotherBook.isbn) return 0;
	 * return 1; }
	 */

	
}




