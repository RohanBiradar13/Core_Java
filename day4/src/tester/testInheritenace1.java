package tester;



import inheritance.Faculty;
import inheritance.Student;

public class testInheritenace1 {
 public static void main(String[] args) {
	 Student s1 = new Student("Rohan" , "Biradar", "A", 2022, 50000, 99,"FullStackDeveloper");
	 System.out.println(s1.toString());
	 Faculty f1 =new Faculty("Shrishti", "Kapadia", 10, "Java");
	 System.out.println(f1);//internally it will call f1.toString.
	f1.yz("hi");
	 
 }
}
