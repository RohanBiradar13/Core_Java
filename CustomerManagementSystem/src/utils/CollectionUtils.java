package utils;

import java.util.HashMap;
import java.util.Map;
import com.app.core.Customer;
import static java.time.LocalDate.parse;
import static com.app.core.CustomerCategory.valueOf;

public interface CollectionUtils {

	public static Map<String, Customer> populateData() {
		Map<String, Customer> customers = new HashMap<String, Customer>();
		customers.put("rohan@gmail.com", new Customer("Rohan", "rohan@gmail.com", "Brothers", 4000, parse("2001-01-13"),
				valueOf("DIAMOND"), "5896716221"));
		customers.put("rohit@gmail.com", new Customer("Rohit", "rohit@gmail.com", "rohit12", 4000, parse("2000-04-15"),
				valueOf("GOLD"), "696716221"));
		customers.put("aman@gmail.com", new Customer("Aman", "aman@gmail.com", "hihello", 4000, parse("2000-10-21"),
				valueOf("PLATINUM"), "796716221"));
		customers.put("goldy@gmail.com", new Customer("Goldy", "goldy@gmail.com", "goldy123", 4000, parse("2001-12-21"),
				valueOf("SILVER"), "1096716221"));
		customers.put("suresh@gmail.com", new Customer("Suresh", "suresh@gmail.com", "suresh123", 4000, parse("2001-09-08"),
				valueOf("SILVER"), "996716221"));
		return customers;
	}
}
