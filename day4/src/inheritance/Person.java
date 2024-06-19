package inheritance;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person(String fn, String ln) {
		super();
		System.out.println("in person constrctor...");
		this.firstName = fn;
		this.lastName = ln;
	}

	@Override
	public String toString() {
		return this.firstName + " " + this.lastName ;
	}
	
	public String getfirstName() {
		return this.firstName;
	}
	
	public String getlastName() {
		return this.lastName;
	}
	public void yz(String s) {
		System.out.println("yz ineritance"+s); 
	}
	
    
	
	
}
