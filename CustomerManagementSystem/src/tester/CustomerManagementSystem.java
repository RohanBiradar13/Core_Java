package tester;

import static com.app.core.CustomerCategory.valueOf;
import static utils.IOutils.readData;
import static utils.IOutils.writeData;
import static utils.ValidationRules.checkCustomerType;
import static utils.ValidationRules.checkDate;
import static utils.ValidationRules.checkEmail;
import static utils.ValidationRules.checkPasswordLength;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.CyclicBarrier;

import com.app.core.Customer;
import com.app.core.CustomerCategory;

import customException.CustomerHandalingException;

public class CustomerManagementSystem {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the file name");
			String fileName = sc.next();
			Map<String, Customer> customers = readData(fileName);
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Add a customer");
				System.out.println("2.Remove a customer");
				System.out.println("3.Update a customer plan");
				System.out.println("4.Get a customer by email Id");
				System.out.println("5.Display all customers");
				System.out.println("6.Display customers as per specified customer plan");
				System.out.println("7.sort customers by email Id");
				System.out.println("8.sort customers by date");
				System.out.println("9.sort customers as per customer plan price");
				System.out.println("10.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						// String name, String email, String password, double registrationAmount,
						// LocalDate date,
						// CustomerCategory category, String adharcard
						System.out.println(
								"Enter the details of the customers name, email, password, plan amount, date,plan, adharcard number");
						String name = sc.next();
						String email = sc.next();
						String password = sc.next();
						int amount = sc.nextInt();
						String date = sc.next();
						String plan = sc.next();
						String adharcardNo = sc.next();

						customers.put(email, new Customer(name, checkEmail(email), checkPasswordLength(password),
								amount, checkDate(date), checkCustomerType(plan, amount), adharcardNo));
						System.out.println("Customer added successfully!!!");

						break;

					case 2:
						System.out.println("Enter the email id");
						email = sc.next();
						Customer c = customers.remove(email);
						if (c == null)
							throw new CustomerHandalingException("Email id is not present in our data");
						else
							System.out.println("Customer removed " + c);

						break;
					case 3:
						System.out.println("Enter the email id");
						email = sc.next();
						System.out.println("Enter the plan");
						String plan1 = sc.next();
						CustomerCategory p = valueOf(plan1.toUpperCase());
						Customer c1 = customers.get(email);
						if (c1 == null)
							throw new CustomerHandalingException("Email id is not present in our data");
						else {
							c1.setCategory(p);
							c1.setRegistrationAmount(p.getCharges());
							System.out.println("Customer plan is updated...");
						}

						break;
					case 4:
						System.out.println("Enter the email id");
						email = sc.next();
						Customer c3 = customers.get(email);
						if (c3 == null)
							throw new CustomerHandalingException("Email id is not present in our data");
						else
							System.out.println("Customer details " + c3);

						break;
					case 5:
						for (Customer c5 : customers.values()) {
							System.out.println(c5);
						}
						break;
					case 6:
						/*
						 * System.out.println("Enter the customer plan"); plan = sc.next();
						 * CustomerCategory c4 = valueOf(plan.toUpperCase()); Collection customersPlan =
						 * customers.values();
						 */
						// customersPlan.stream().filter((c10) ->
						// c10.equals(c4)).forEach(System.out::println);
						// customersPlan.stream().filter(c10 ->
						// c10.getCategory().equals(c4)).forEach(System.out::println);

						System.out.println("Enter the customer plan");
						plan = sc.next();
						CustomerCategory categoryToFilter = valueOf(plan.toUpperCase()); // Convert to upper case for
																							// consistency
						customers.values().stream().filter(cust -> cust.getCategory().equals(categoryToFilter)) // Use
																												// the
																												// getCategory
																												// method
																												// to
																												// filter
																												// by
																												// plan
								.forEach(System.out::println); // Print each customer that matches the plan
						break;

					case 7:
						TreeMap<String, Customer> sortedCustomers = new TreeMap<String, Customer>(customers);
						sortedCustomers.values().forEach(System.out::println);
						break;
					case 8:

						Collection<Customer> customers1 = customers.values();
						ArrayList<Customer> customers2 = new ArrayList<Customer>(customers1);
						Collections.sort(customers2, (cust1, cust2) -> cust1.getDate().compareTo(cust2.getDate()));
						customers2.forEach(System.out::println);

						break;
					case 9:
						Collection<Customer> customers5 = customers.values();
						ArrayList<Customer> customers6 = new ArrayList<Customer>(customers5);
						Collections.sort(customers6, (cust1, cust2) -> ((Double) cust1.getRegistrationAmount())
								.compareTo(cust2.getRegistrationAmount()));
						customers6.forEach(System.out::println);

						break;
					case 10:
						exit = true;
						writeData(fileName, customers);
						System.out.println("Data is saved in " + fileName);

						break;

					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}
	}

}
