package utils;

import java.util.HashMap;
import java.util.Map;
import static java.time.LocalDate.parse;
import static com.app.core.ServicePlan.*;

import com.app.core.Customer;

public interface CustomersUtility {

	static HashMap<String, Customer> populateData(){
		HashMap<String, Customer> customers = new HashMap<String, Customer>();
		customers.put("rohan13biradar@gmailcom", new Customer( "Rohan", "Biradar", "rohan13biradar@gmailcom", "brothers", 10000, parse("2024-08-01"), PLATINUM));
		customers.put("rohit10biradar@gmailcom", new Customer( "Rohit", "Biradar", "rohit10biradar@gmailcom", "brothersBhai", 10000, parse("2024-08-01"), GOLD));
		customers.put("kishormagar@gmailcom", new Customer( "Kishor", "Magar", "kishormagar@gmailcom", "kishor1234", 10000, parse("2024-08-01"), SILVER));
		customers.put("aniket@gmailcom", new Customer( "Aniket", "Vyas", "aniket@gmailcom", "aniket1234", 10000, parse("2024-08-01"), DIAMOND));
		customers.put("aman@gmailcom", new Customer( "Aman", "Gupta", "aman@gmailcom", "aman1234", 10000, parse("2024-08-01"), SILVER));
		customers.put("digvijay@gmailcom", new Customer( "Digvijay", "Patil", "digvijay@gmailcom", "dig123", 10000, parse("2024-08-01"), PLATINUM));
		
		return customers;
	}
}
