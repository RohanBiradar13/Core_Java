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
	list.add(new Emp(2, "Vebs", 2000,RND, sdf.parse("11-01-2024")));
	list.add(new Emp(3, "Digvijay", 3000,RND, sdf.parse("1-709-2024")));
	list.add(new Emp(4, "Rohit", 1000,RND, sdf.parse("11-01-2024")));
	list.add(new Emp(5, "Amit", 5000,RND, sdf.parse("11-01-2024")));
	list.add(new Emp(6, "Abhya", 1000,RND, sdf.parse("18-09-2024")));
	list.add(new Emp(7, "Abdya", 1000,RND, sdf.parse("19-09-2024")));
	
	return list;
	
}
}
