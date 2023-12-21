package code;
import java.util.ArrayList;
import java.util.Scanner;
public class Student{
	private String name;
	//private Arraylist<Double>marks;
	 private ArrayList<Double> marks;
	public Student(String name) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Double> getMarks() {
		return marks;
	}
	public void setMarks(ArrayList<Double> marks) {
		this.marks = marks;
	}
    public double CalculateTotal() { 
    	double total = 0;
    	for(double mark: marks) {
    	total += mark;
    }
    	return total;
    }
    public double Average() {
    	return CalculateTotal() / marks.size();
    }
    
    public static Student enterStudentDetails(Scanner sc) {
	   System.out.println("Enter the student name");
	   String name = sc.nextLine();
	   ArrayList<Double>marks = new ArrayList<>();
	   System.out.println("Enter the marks of 5 subjects");
	   for(int i = 0; i < 5; i++) {
		   System.out.println("Enter the marks of subject" + (i + 1) + ": ");
		   double mark = sc.nextDouble();
		   marks.add(mark);
	   }
	   Student student = new Student(name);
       student.setMarks(marks);
        return student;
   }
    public static void displayStudentDetails(ArrayList<Student> students) {
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Marks for 5 subjects: " + student.getMarks());
            System.out.println("Total Marks: " + student.CalculateTotal());
            System.out.println("Average Marks: " + student.Average());
            System.out.println();
        }
   
    }
}
	