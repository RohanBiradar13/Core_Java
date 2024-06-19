package tester;

import static utils.ValidationRules.*;

import java.util.Scanner;



public class TestCustomException {
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)) 
	{
		System.out.println("Enter the speed of car");
		validateSpeed(sc.nextInt());
		System.out.println("end of try");
		
	}catch (Exception e) {
		//System.out.println(e);
		//e.printStackTrace();
		System.out.println(e.getMessage());;
	}
	System.out.println("main over");
}
}
