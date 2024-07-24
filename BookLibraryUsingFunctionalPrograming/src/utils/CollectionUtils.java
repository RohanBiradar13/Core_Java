package utils;

import java.util.HashMap;
import java.util.Map;
import static com.app.core.Category.*;
import static java.time.LocalDate.parse;
import com.app.core.Category;
import com.app.core.Book;

public interface CollectionUtils {

	static HashMap<String,Book> populateData(){
		HashMap<String, Book> books = new HashMap<String, Book>();
		books.put("book1", new Book("book1", "Ramesh", 500, FICTION, 50, parse("1999-01-01")));
		books.put("book2", new Book("book2", "Gauri", 400, SCIENCE, 20, parse("2001-01-01")));
		books.put("book6", new Book("book6", "Kiran", 700, YOGA, 17, parse("1992-08-12")));
		books.put("book3", new Book("book3", "Mihir", 450, SCIENCE, 23, parse("2001-07-15")));
		books.put("book4", new Book("book4", "Ramesh", 510, FICTION, 15, parse("2001-04-11")));
				return books;
	}
}
