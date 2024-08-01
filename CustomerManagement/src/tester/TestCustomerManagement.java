package tester;

import static com.app.core.ServicePlan.valueOf;
import static java.time.LocalDate.parse;
import static utils.CustomerValidation.checkEmail;
import static utils.CustomerValidation.checkPlan;
import static utils.CustomerValidation.validateEmail_Password;
import static utils.IOUtils.readData;
import static utils.IOUtils.writeData;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Customer;
import com.app.core.ServicePlan;

import customException.CustomerHandalyingException;

public class TestCustomerManagement {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the file name ");
			String fileName = sc.next();
			HashMap<String, Customer> customers = readData(fileName);

			boolean exit = false;
			while (!exit) {
				System.out.println("1.Sign Up(customer registration)");
				System.out.println("2.Sign in(login)");
				System.out.println("3.Change Password");
				System.out.println("4.Un subscribe customer");
				System.out.println("5.Display all customers");
				System.out.println("6.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter the customer details firstName, lastName, email, password, registrationAmount, dob, plan");
						String firstName = sc.next();
						String lastName = sc.next();
						String email = sc.next();
						String password = sc.next();
						double amount = sc.nextInt();
						LocalDate dob = parse(sc.next());
						ServicePlan plan = valueOf(sc.next().toUpperCase());
						checkEmail(customers, email);
						checkPlan(plan, amount);
						customers.put(email, new Customer(firstName, lastName, email, password, amount, dob, plan));
						System.out.println("Customer added successfully");
						break;
					case 2:
						System.out.println("Enter the email and password");
						email = sc.next();
						password = sc.next();
						if (validateEmail_Password(customers, email, password)) {
							System.out.println("Login Successfully...");
						}

					case 3:

						System.out.println("Enter the email, old password, and new password");
						email = sc.next();
						password = sc.next();
						String newPassword = sc.next();
						if (validateEmail_Password(customers, email, password)) {
							System.out.println("Login Successfully...");
							Customer customer = customers.get(email);
							if (customer != null) {
								customer.setPassword(newPassword);
								System.out.println("Password changed successfully.");
							} else {
								System.out.println("Customer not found.");
							}
						} else {
							throw new CustomerHandalyingException("Invalid password");
						}
						break;

					case 4:
						System.out.println("Enter the email");
						email = sc.next();
						customers.remove(email);
						System.out.println("Customer unsubscribed...");
						break;
					case 5:
						customers.values().forEach(System.out::println);
						break;

					case 6:
						exit = true;
						writeData(customers, fileName);
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
