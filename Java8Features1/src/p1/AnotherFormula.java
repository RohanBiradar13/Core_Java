package p1;

public class AnotherFormula implements Formula {
	
	@Override
 public double calculate(double a) {
		System.out.println("implementation abstract method in AnotherFormula");
		return a*10;
	}
@Override
public double sqrt(double a, double b) {
	System.out.println("overriding default method");
	return Math.sqrt(a*b);

}
}
