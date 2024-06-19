package utils;

import com.app.core.Customer;
import static com.app.core.Customer.sdf;

import java.text.ParseException;

import customException.CustomerHandlingException;

public class ValidationRules {
 public static Customer validateEmailandPassword(String name, String email, String password, double registrationAmount, String dob) throws CustomerHandlingException, ParseException{
	Customer c = new  Customer(name, email, password, registrationAmount, sdf.parse(dob));
	if(email.contains("@")&& email.contains(".com")) {
		
		System.out.println("Valid Email");
		
	}
	else {
		throw new CustomerHandlingException("Invalid Email");
	}
		if(password.length()<4 && password.length()>10 ) {
			
			throw new CustomerHandlingException("Password lentgh should be >4 and <10");
			
	
	}else {
		System.out.println("Password length is okay");
	}
		return c;
		
	 
 }

}
