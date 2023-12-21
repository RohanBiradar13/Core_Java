package tester;

import java.util.Scanner;
import static Validation.ValidateSpeed.checkSpeed;

public class TestCustomException {
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)){
		System.out.println("Enter current speed");
		checkSpeed(sc.nextInt());
	}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("main over..");
}
}
