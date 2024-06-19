import java.util.Scanner;

public class TestEquality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimns of 1st box");
		Box b1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println("Enter the dims of 2nd box");
		Box b2 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		//System.out.println(b1.isEqual(b2));
		if(b1.isEqual(b2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
		System.out.println("Enter the 3 offset");
		
		Box b3 =(b1.createNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
		System.out.println(b3.getDimentions());
		
		sc.close();

	}

}
