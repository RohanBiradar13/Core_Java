package tester;

import static utils.CollectionUtils.populateData;
import static java.time.LocalDate.parse;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.core.Book;

import customException.BookHandalyingException;

public class TestBookLibrary {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, Book> books = populateData();
			boolean exit = false;
			System.out.println("1. Display all available books");
			System.out.println("2. Issue out a book");
			System.out.println("3. Return a book");
			System.out.println("4. Apply discount on old books");
			System.out.println("5. Sort books as per ISBN");
			System.out.println("6. Sort books as per book price");
			System.out.println("7. Exit");
			while (!exit) {
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("All available books:");
						books.forEach((isbn, book) -> System.out.println(book));
						break;
					case 2:
						System.out.println("Enter book ISBN & quantity:");
						String isbn = sc.next();
						int quantity = sc.nextInt();
						if (books.get(isbn) == null) {
							throw new BookHandalyingException("Invalid book ISBN");
						}
						Book b = books.get(isbn);
						if (b.getQuantity() < quantity) {
							throw new BookHandalyingException("Invalid quantity");
						}
						b.setQuantity(b.getQuantity() - quantity);
						System.out.println("Book issued successfully");
						break;
					case 3:
						System.out.println("Enter the ISBN & quantity:");
						String isbn3 = sc.next();
						int quantity2 = sc.nextInt();
						if (books.get(isbn3) == null) {
							throw new BookHandalyingException("Invalid book isbn");
							/*
							 * System.out.println("Add this book to the library"); //String isbn, String
							 * author, double price, Category categroy, int quantity, LocalDate publishDate
							 * System.out.
							 * println("Enter full details of the book: ISBN, author, price,Category, quantity, publish date (yyyy-MM-dd)"
							 * ); //books.put("book15", new Book("book15", "Suresh",
							 * 5000,valueOf("FICTION"), 5, parse("2024-04-04"))); // books.put(isbn3, new
							 * Book(isbn, sc.next(), sc.nextDouble(),valueOf.sc.next(), quantity2,
							 * parse.sc.next()));
							 * System.out.println("Book added to library successfully...");
							 */
						} else {
							Book returnBook = books.get(isbn3);
							returnBook.setQuantity(returnBook.getQuantity() + quantity2);
							System.out.println("Book returned successfully");
						}
						break;
					case 4:

						System.out.println("Enter date (yyyy-MM-dd) & discount amount:");
						LocalDate date = parse(sc.next());
						double discount = sc.nextDouble();

						books.forEach((isbn1, book) -> {
							if (book.getPublishDate().isBefore(date))
								book.setPrice(book.getPrice() - discount);
						});
						System.out.println("Discount applied");
						break;

					case 5:
						// Sorting logic can be added here
						TreeMap<String, Book> sortedBooks = new TreeMap<>(books);
						sortedBooks.forEach((isbn2, book) -> System.out.println(book));
						break;
					case 6:
						Collection<Book> books1 = books.values();
						ArrayList<Book> books2 = new ArrayList<>(books1);
						// Collections.sort(accounts1,
						// (ac1,ac2)->((Double)ac1.getBalance()).compareTo(ac2.getBalance()));
						Collections.sort(books2,
								(book1, book2) -> ((Double) book1.getPrice()).compareTo(book2.getPrice()));
						books2.forEach(book -> System.out.println(book));

						break;
					case 7:
						exit = true;
						break;
					default:
						System.out.println("Invalid choice, please try again.");
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine(); // Clear the buffer
				}
			}
		}
	}
}
