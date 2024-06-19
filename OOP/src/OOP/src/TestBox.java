import java.util.Scanner;

public class TestBox {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimentions of the box -> height, width, depth ");
		Box b1;
		b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		
		System.out.println(b1.getDimentions());
		System.out.println(b1.getVolume());
		System.out.println("Enter the side of the cube -> side");
		Box cube = new Box(sc.nextDouble());
		System.out.println(cube.getDimentions());
		System.out.println(cube.getVolume());
		sc.close();

	}

}
