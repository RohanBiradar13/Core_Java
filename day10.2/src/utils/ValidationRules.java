package utils;

import static com.app.core.Customer.sdf;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

import com.app.core.Customer;
import com.app.core.CustomerCategory;

import customException.CustomerHandlingException;

public class ValidationRules {
	public static final int MIN_LENGTH;
	public static final int MAX_LENGTH;
	public static Date thresholdDate;

	static {
		MIN_LENGTH = 4;
		MAX_LENGTH = 10;
		try {
			thresholdDate = sdf.parse("1-1-1995");
		} catch (ParseException e) {

			System.out.println("error in sttaic block");
		}
	}

	public static Customer checkForDuplicate(Customer[]c1, String name, String email, String password, double registrationAmount,
			String date,String customerType) throws ParseException, CustomerHandlingException {
	//	Customer c = new Customer(name, email, password, registrationAmount, sdf.parse(date),CustomerCategory.valueOf(customerType.toUpperCase()));
		Customer c= new Customer(name, email, password, registrationAmount, sdf.parse(date), CustomerCategory.valueOf(customerType.toUpperCase()));		
				for(Customer c3: c1) {
				if(c3!=null) {
				if(c3.equals(c)) {
					throw new CustomerHandlingException("Duplicate email detected..");
				}
			}
		}validateEmail(email);
		validatePassword(password);
		validateAmount(registrationAmount);
		convertDate(date);
		validateCategory(customerType);
		return c;
		

	}

	public static String validateEmail(String email) throws CustomerHandlingException {
		if (email.contains("@") && email.contains(".com")) {
			return email;
		} else {
			throw new CustomerHandlingException("Invalid Email->password must contain @ and .com");
		}
	}

	public static String validatePassword(String password) throws CustomerHandlingException {
		if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) {
			throw new CustomerHandlingException("Password length should be >4 and <10");
		} else {
			return password;
		}
	}

	// add a static method for validating registration amount is multiple of 500
	public static double validateAmount(double amount) throws CustomerHandlingException {
		if (amount % 500 != 0) {
			throw new CustomerHandlingException("Invalid Amount");
		}
		return amount;
	}

	public static Date convertDate(String date) throws ParseException, CustomerHandlingException {
		Date d1 = sdf.parse(date);
		if (d1.after(thresholdDate)) {
			throw new CustomerHandlingException("Date must be before 1995");
		}
		return d1;

	}
	public static CustomerCategory validateCategory(String category)throws CustomerHandlingException {
		try {
			return CustomerCategory.valueOf(category.toUpperCase());
		}catch (IllegalArgumentException e) {
			StringBuilder sb=new StringBuilder("Invalid Category chosen \n");
			sb.append("Valid Categories \n");
			sb.append(Arrays.toString(CustomerCategory.values()));
			throw new CustomerHandlingException(sb.toString());
		}
	}

}
