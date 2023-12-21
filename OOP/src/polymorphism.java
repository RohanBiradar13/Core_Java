class Ftudent{
	String name;
	int age;
	 //below we can see that the function name -> display is 
	//is same but the argument we are passing is different
	//so there is no error.
	//this is function overloading'
	//there are 3 rules
	//1)if the func name is same then return type must be different.
	//2)argument different
	//3)Run type 
	public void display(String name,int age) {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	public void display(String name) {
		System.out.println(this.name);
	}
	
	public void display(int age) {
		System.out.println(this.age);
	}
	
	Ftudent(String name,int age){
		this.name = name;
		this.age = age;
	}
}
public class polymorphism {
//polymorphism -> different forms of same thing
	
	public static void main(String[] args) {
	Ftudent s1 = new Ftudent("Rohan",23);
	
	s1.display(s1.name , s1.age);
 
	}

}
