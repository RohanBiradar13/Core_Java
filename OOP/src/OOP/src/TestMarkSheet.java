import java.util.Scanner;

public class TestMarkSheet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students");
		MarkSheet[] students=new MarkSheet[sc.nextInt()];
		for(int i=0; i<students.length; i++) {
			System.out.println("Enter the name & marks of name, english, math, science, marathi, history");
			students[i] = new MarkSheet(sc.next(),sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		int counter=1;
		for(int i=0; i<students.length; i++) {
			
			MarkSheet m1 =students[i];
			System.out.println("student"+" "+counter+" "+"Total marks & average of"+" "+m1.getName()+" " +m1.totalMarks() + " "+ m1.average());
		counter++;
		}
		
		

	}

}
