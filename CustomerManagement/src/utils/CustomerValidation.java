package utils;

import java.util.Map;

import com.app.core.Customer;
import com.app.core.ServicePlan;

import customException.CustomerHandalyingException;

import static com.app.core.ServicePlan.values;

public interface CustomerValidation {

	static ServicePlan checkPlan(ServicePlan plan, double planPrice) throws CustomerHandalyingException {
		for (ServicePlan servicePlan : values()) {
			if (servicePlan.equals(plan)) {
				if (servicePlan.getValue() == planPrice) {
					return plan;
				} else {
					throw new CustomerHandalyingException("Invalid plan price for " + plan);
				}
			}
		}
		throw new CustomerHandalyingException("Invalid Service Type: " + plan);
	}

	static String checkEmail(Map<String, Customer> customers, String email) throws CustomerHandalyingException {
		if (customers.containsKey(email)) {
			throw new CustomerHandalyingException("Your email already exists " + email);
		}
		return email;

	}

	static boolean validateEmail_Password(Map<String, Customer> customers, String email, String password)
			throws CustomerHandalyingException {
		if (customers.containsKey(email)) {
			Customer storedCustomer = customers.get(email);
			if (storedCustomer.getPassword().equals(password)) {
				return true; // Password matches
			} else {
				throw new CustomerHandalyingException("Invalid password for email: " + email);
			}
		} else {
			throw new CustomerHandalyingException("Invalid email: " + email);
		}
	}

}
