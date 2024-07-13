package sets;

import java.util.HashSet;

import com.app.core.Student;

public class TestStudentSet {

	public static void main(String[] args) {
		
		//IN THIS TETSER CLASS : equal objects produce SAME hash code 
		//BUT un equal objects are producing different hashCode
		//TIME COMPLEXITY : O(1)
		
		HashSet<Student> students = new HashSet<Student>();
		Student s1 = new Student(100, "Rama", "Pune");
		Student s2 = new Student(10, "Kishor", "Pune");
		Student s3 = new Student(56, "Riya", "Pune");
		Student s4 = new Student(100, "Rama", "Satara");

		System.out.println("Added "+students.add(s1));//true
		System.out.println("Added "+students.add(s2));
		System.out.println("Added "+students.add(s3));
		System.out.println("Added "+students.add(s4));
           
		for(Student s: students) {
			System.out.println(s);
		}
		System.out.println(students.size());
		
		//contract : equal objects must produce same Hash Code values
		System.out.println("eq: "+s1.equals(s2));//true
		System.out.println("hashCodes:"+s3.hashCode()+" "+s4.hashCode());//different hash codes
	
	
	}

}
