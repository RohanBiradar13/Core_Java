package shapes;

public class Circle extends BoundedShapes {
 private double radius;

public Circle(int x, int y, double radius) {
	super(x, y);
	this.radius = radius;
}

@Override
public String toString() {
	return "Circle" +super.toString()+"[radius=" + radius + "]";
}

public double area() {
	return Math.PI*radius*radius;
}
 
}
