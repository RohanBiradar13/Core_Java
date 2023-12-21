package tester;

import java.util.ArrayList;
import java.util.Scanner;

import code.Student;

import static code.Student.enterStudentDetails;
import static code.Student.displayStudentDetails;


public class TestStudent{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 ArrayList<Student> students = new ArrayList<>();

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Enter student details");
	            System.out.println("2. Display student details");
	            System.out.println("3. Exit");

	            System.out.print("Enter your choice (1/2/3): ");
	            int choice = sc.nextInt();
	            sc.nextLine(); // Consume newline
	            
	            switch (choice) {
	                case 1:
	                    Student student = enterStudentDetails(sc);
	                    students.add(student);
	                    System.out.println("Student details added successfully!");
	                    break;
	                case 2:
	                    if (students.isEmpty()) {
	                        System.out.println("No student details entered yet.");
	                    } else {
	                        displayStudentDetails(students);
	                    }
	                    break;
	                case 3:
	                    System.out.println("Exiting the program...");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
	            }
	        }
	    }
		
		
	}
