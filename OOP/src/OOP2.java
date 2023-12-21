class Student{
	String name;
	int age;
	public void display() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	//this below constructor  is a copy constructor to get 
	//the details of s1 to s2
	Student(Student s2){
		this.name = s2.name;
		this.age = s2.age;
	}
	 Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
public class OOP2 {
 
	public static void main(String[] args) {
		Student s1 = new Student("Rohan",23);
		//as soon as obj gets created constructor gets called
		//new -> obj gets created
		Student s2 = new Student(s1);//copy constructor
		s1.display();
		s2.display();
		Student s3 = new Student("Sh",23);
		s3.display();
 
	}

}
