package teststatic;

public class TestMe {
	public static int counter;

	public static void main(String[] args) {
		System.out.println("idcounter =" + counter);// we can directly access static member in main method
	}

	public static double add(double a, double b) {
    	  // multiply(10,12);//we can't access non-static method in static method directly.
		TestMe t1 = new TestMe();
		t1.multiply(a, b);//we can access non-static method by creating an object.
    	   return a+b;
       }

	public double multiply(double a, double b) {
		add(a, b);//we can directly access static method members & methods in non-static methods.
		int i = counter;//^
		return a * b;
	}

}
