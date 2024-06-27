package utils;

import java.text.ParseException;
import java.util.ArrayList;

import com.app.core.Emp;
import static com.app.core.Department.*;
import static com.app.core.Emp.sdf;

public class CollectionUtils {
public static ArrayList<Emp> populateData() throws ParseException{
	ArrayList<Emp> list = new ArrayList<Emp>();
	list.add(new Emp(1, "Rohan", 1000000,RND, sdf.parse("13-09-2024")));
	list.add(new Emp(4, "Vebs", 2,HR, sdf.parse("11-01-2024")));
	list.add(new Emp(7, "Digvijay", 3,FINANACE, sdf.parse("1-709-2024")));
	list.add(new Emp(3, "Rohit", 1,SALES, sdf.parse("1-09-2024")));
	list.add(new Emp(2, "Amit", 5,MARKETING, sdf.parse("17-09-2024")));
	list.add(new Emp(6, "Abhya", 1,FINANACE, sdf.parse("18-09-2024")));
	list.add(new Emp(5, "Abdya", 1,RND, sdf.parse("19-09-2024")));
	
	return list;
	
}
}
