package inheritance;

public class Student extends Person {
	private String grade;
	private int year;
	private double courseFees;
	private int marks;
	private String courseName;

	public Student(String fn, String ln, String grade, int year, double courseFees, int marks, String courseName) {
		super(fn ,ln);
		System.out.println("in students class constructor...");
		this.grade = grade;
		this.year = year;
		this.courseFees = courseFees;
		this.marks = marks;
		this.courseName=courseName;
	}
	@Override
	public String toString() {
		return super.toString()+" "+this.grade+" "+this.year+" "+this.courseFees+" "+this.marks;
	}
	
	public String study() {
		return getfirstName()+" "+"is studying in"+" "+courseName;
	}
	
}
