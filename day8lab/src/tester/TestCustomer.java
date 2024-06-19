package tester;

import java.util.Date;
import java.util.Scanner;

import com.app.core.Customer;

import static utils.ValidationRules.*;
public class TestCustomer {
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)){
		System.out.println("Enter name, email, password, registrationAmount, dob");
	Customer c=validateEmailandPassword(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next());
		Customer customers = c;
		System.out.println(customers);
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
