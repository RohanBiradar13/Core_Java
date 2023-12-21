class Shape {
	String colour;
     int i = 10;
	public void area() {
		System.out.println("in shape class");
		System.out.println(i);
	}
}

class Triangle extends Shape {
	int j = 20;
	
	public void area(int l,int h) {
		
		System.out.println(1 / 2 * l * h);
		System.out.println(j);
		
	}
}
//this below EqilateralTriangle is a multilevel inheritance 
class EqilateralTriangle extends Triangle{
	public void area(int l, int h) {
		System.out.println(1 / 2 * l * h);
		
	}
}
//this below circle is hierarchical inheritance
class Circle extends Shape {
	public void area(int r) {
		System.out.println((3.14) * r * r);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.colour = "RED";// we are getting color property
							// from shape class color property is not in triangle.
		t1.area(10,10);
		Circle c1 = new Circle();
		c1.colour = "Blue";
		c1.area();
		EqilateralTriangle e1 = new EqilateralTriangle();
		e1.colour = "Pink";
		e1.area();
		//t1.i = 1;
		//t1.j = 2;
		Shape r;
		r = t1;
		r.area();
		
		}

}
