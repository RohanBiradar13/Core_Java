package p1;

public class MyFormula implements Formula {
	
	@Override
 public double calculate(double a) {
		System.out.println("implementation abstract method in Myformula");
		return a*10;


}
}
