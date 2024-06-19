package tester;

import shapes.BoundedShapes;
import shapes.Circle;
import shapes.Rectangle;

public class TestAbstraction {

	public static void main(String[] args) {
		BoundedShapes[] shapes= {new Circle(2, 4, 4.0),new Rectangle(4, 5, 10, 20)};
		for(BoundedShapes b: shapes) {
			System.out.println(b.toString());
			System.out.println(b.area());
		}
       
	}

}
