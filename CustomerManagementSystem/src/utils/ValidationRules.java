package utils;

import java.time.LocalDate;
import java.util.Arrays;

import com.app.core.CustomerCategory;

import customException.CustomerHandalingException;

public interface ValidationRules {
	int MIN_LENGTH = 4;
	int MAX_LENGTH = 10;
	LocalDate thresholdDate = LocalDate.parse("2000-01-01");

	static void hi() {
		System.out.println("hi");
	}
	// add a method the check the password length
	// add a method to check the date
	// add a method to check the email is validated(contains "@" and ".com")
	// add a method to check customer type is valid or not if not then give error
	// message

	static String checkPasswordLength(String password) throws CustomerHandalingException {
		if (password.length() > MIN_LENGTH | password.length() < MAX_LENGTH)
			return password;
		else
			throw new CustomerHandalingException("Password length must be > 4 and < 10");
	}

	static LocalDate checkDate(String date) throws CustomerHandalingException {
		LocalDate date1 = LocalDate.parse(date);
		if (date1.isBefore(thresholdDate))
			throw new CustomerHandalingException("Date must be after 2000-01-01");
		else
			return date1;
	}

	static String checkEmail(String email) throws CustomerHandalingException {
		if (email.contains("@") && email.contains("@.com"))
			throw new CustomerHandalingException("Customer email must contain @ and .com ");
		else
			return email;
	}

	static CustomerCategory checkCustomerType(String type, int amount) throws CustomerHandalingException {
		try {
			// Attempt to convert the provided type to a CustomerCategory
			CustomerCategory type1 = CustomerCategory.valueOf(type.toUpperCase());

			// Check if the amount matches the charges for the selected plan
			if (amount != type1.getCharges()) {
				throw new CustomerHandalingException("The amount must match the selected plan's charges.");
			}
			return type1;

		} catch (IllegalArgumentException e) {
			// Handle case when an invalid category is provided
			String validCategories = Arrays.toString(CustomerCategory.values());
			throw new CustomerHandalingException("Invalid plan chosen. Available plans are: " + validCategories);
		}
	}

}
