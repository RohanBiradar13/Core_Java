class Pen {
	String brand;
	String colour;
	String type;

	public void display() {
		System.out.println("Writing Something");
	}
	public void printproperties() {
		System.out.println(this.brand);
		System.out.println(this.colour);
		System.out.println(this.type);
	}
}

public class OOP1 {
	public static void main(String[] args) {
		Pen pen1 = new Pen();
        pen1.brand = "Parker";
        pen1.colour = "Blue";
        pen1.type = "Ball";
        pen1.display();
        pen1.printproperties();
        
        Pen pen2 = new Pen();
        pen2.brand = "Reynolds";
        pen2.colour = "Black";
        pen2.type = "Gel";
        pen1.display();
        pen1.printproperties();
	}
}