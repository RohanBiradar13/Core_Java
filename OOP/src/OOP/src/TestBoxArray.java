import java.util.Arrays;
import java.util.Scanner;



public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of boxes");
		Box boxes[] = new Box[sc.nextInt()];
		for (int i = 0; i < boxes.length; i++) {
			System.out.print("Enter the w h d of the box");
			boxes[i] = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
			boxes[i].doubleBoxWidth();
		}
		for (Box b : boxes) {
			System.out.println(b.getDimentions());	 
			System.out.println("Volume =" + b.getVolume());
		}
		
		System.out.println(Arrays.toString(boxes));//this will hold reference or address of
		//boxes[i] bcoz this is reference type of array.
		sc.close();
	}
}

