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
	list.add(new Emp(2, "Vebs", 200000,RND, sdf.parse("11-01-2024")));
	list.add(new Emp(3, "Digvijay", 300000,RND, sdf.parse("1-709-2024")));
	list.add(new Emp(4, "Rohit", 100000,RND, sdf.parse("1-09-2024")));
	list.add(new Emp(5, "Amit", 500000,RND, sdf.parse("17-09-2024")));
	list.add(new Emp(6, "Abhya", 100000,RND, sdf.parse("18-09-2024")));
	list.add(new Emp(7, "Abdya", 100000,RND, sdf.parse("19-09-2024")));
	
	return list;
	
}
}
