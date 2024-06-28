package tester;

import static com.app.core.Book1.sdf;
import static utils.ColletionDate.populateDate;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.app.core.Book1;
import com.app.core.Category;

import customExcepton.BookHandlyingExcepton;

public class TestBookLibrary {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Book1> books = populateDate();
			boolean exit = false;
			while (!exit) {
				System.out.println("0.Display all available books1.Issue out book 2.Return book 3.Apply "
						+ "discount on old books i.e before specific date 4.Sort the books as per isbn 5.Exit");

				try {
					switch (sc.nextInt()) {
					case 0:
						System.out.println("All available books");
						Iterator<Book1> itr = books.iterator();
						while(itr.hasNext()) {
							System.out.println(itr.next());
						}
						break;
					case 1:
						System.out.println("Enter book isbn & quantity");
						/*
						 * int isbn=sc.nextInt(); int quantity=sc.nextInt(); for(Book b : books) {
						 * if(b.getIsbn()==isbn) { b.setQuantity(b.getQuantity()-quantity);
						 * if(b.getQuantity()< quantity) { throw new
						 * BookHandlyingExcepton("Insufficient quantity"); } }if(b.getIsbn()!=isbn) {
						 * throw new BookHandlyingExcepton("Invalid Book isbn"); } }
						 */
						//this above code using for eah or iterator will not work
						//bcoz if there are multiple conditions to check then it will fail
						//Use index of method & get that Object details then perform operations
						int quantity=sc.nextInt();
						int index=books.indexOf(new Book1(sc.nextInt()));
						if(index != -1) {
						Book1 b=	books.get(index);
						if(b.getQuantity()<= quantity) {
							throw new BookHandlyingExcepton("Insufficient Quantity");
						}
						b.setQuantity(b.getQuantity()-quantity);
						}else {
							throw new BookHandlyingExcepton("Invalid isbn");
						}
						break;
					case 2:
						System.out.println("Enter book isbn & quantity");
						int isbn1=sc.nextInt();
						int quantity1=sc.nextInt();
						index=books.indexOf(new Book1(isbn1));
						for(Book1 b : books) {
							if(b.getIsbn()==isbn1) {
								b.setQuantity(b.getQuantity()+quantity1);
							}
						}if(index == -1) {
							System.out.println("Add this book to library");
							System.out.println("Enter full details of the book isbn, author, price, category, quantity, date");


							books.add(new Book1(sc.nextInt(), sc.next(), sc.nextDouble(), Category.valueOf(sc.next()), sc.nextInt(), sdf.parse(sc.next())));
							System.out.println("Book Added tp library successfully...");
						}
						break;

					case 3:
						System.out.println("Enter date & discount amount");
						Date d = sdf.parse(sc.next());
						double discount=sc.nextDouble();
						for(Book1 b : books) {
							if(b.getDate().before(d)) {
								b.setPrice(b.getPrice()-discount);
							}
						}
						break;
					case 4:
						//Collections.sort(books);
						break;
					case 5:
						exit=true;
					}
					
				} catch (Exception e) {
					e.printStackTrace();
					//e.getMessage();
					sc.nextLine();
				}

			}
		} catch (ParseException e) {

			e.printStackTrace();
		}
	}
}
