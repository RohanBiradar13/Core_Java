package utils;

import static com.app.core.Book1.sdf;
import static com.app.core.Category.CLASSIC;
import static com.app.core.Category.HUMOUR;
import static com.app.core.Category.MYSTERY_FICTION;
import static com.app.core.Category.TRAGEDY;

import java.text.ParseException;
import java.util.ArrayList;

import com.app.core.Book1;

public class ColletionDate {
public static ArrayList<Book1> populateDate() throws ParseException{
	ArrayList<Book1> books1 = new ArrayList<>();
	books1.add(new Book1(3, "Rohan", 5000, MYSTERY_FICTION, 10, sdf.parse("13-10-2024")));
	books1.add(new Book1(2, "Digvijay", 5000, HUMOUR, 5, sdf.parse("30-01-2023")));
	books1.add(new Book1(1, "Vebs", 5000, MYSTERY_FICTION, 1, sdf.parse("17-03-2022")));
	books1.add(new Book1(5 , "Amit", 5000, CLASSIC, 4, sdf.parse("21-02-2024")));
	books1.add(new Book1(4, "Abhya", 5000, TRAGEDY, 10, sdf.parse("13-07-2023")));
	return books1;

}
}
