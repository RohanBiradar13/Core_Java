package p3;

public class MyFormula implements Formula {
	
	@Override
 public double calculate(double a) {
		System.out.println("implementation abstract method in Myformula");
		return a*10;


}
	//can one override inherited static method : NO
	//@Override
	//re-declare : YES
	static boolean isEven(int number) {
		System.out.println("re declaring static method");
		return number % 2 == 0 ;
		
	}
}
