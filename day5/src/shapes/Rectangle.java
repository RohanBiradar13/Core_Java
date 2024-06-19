package shapes;

public class Rectangle extends BoundedShapes {
 private double w,h;
 
	public Rectangle(int x, int y, double w, double h) {
	super(x, y);
	this.w = w;
	this.h = h;
}

	@Override
	public String toString() {
		return "Rectangle"+super.toString()+"[w=" + w + ", h=" + h + "]";
	}

	@Override
	public double area() {
		return w*h;
		
	}

}
