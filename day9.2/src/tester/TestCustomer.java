package tester;

import java.util.Scanner;

import com.app.core.Customer;

import customException.CustomerHandlingException;
import static utils.ValidationRules.checkForDuplicate;

public class TestCustomer {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the capacity of customers:");
			Customer customers[] = new Customer[sc.nextInt()];
			int counter = 0;
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Add a customer 2.Display customes 3.Exit");
				try {
					switch (sc.nextInt()) {

					case 1:
						if (counter < customers.length) {
							System.out.println(" Enter details: name, email, password, registrationAmount, date, customer type");
							Customer c= checkForDuplicate(customers, sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),sc.next());
							customers[counter++] = c;
						} else {
							throw new CustomerHandlingException("Customer List is Full..");
						}

						break;

					case 2:
						
							for (Customer c : customers) {
								if (c != null)
									System.out.println(c);
							}

						break;
					case 3:
						exit = true;
						break;

					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}

	}
}