package p3;

public interface Formula {
double calculate(double a);//public n abstract

//public 
default double sqrt(double a, double b) {
	System.out.println("in i/f default method");
	return Math.sqrt(a+b);
}
//can add static methods
//keywords added by javac : public
static boolean isEven(int number) {
	System.out.println("in i/f sattic method");
	return number % 2 == 0 ;
	
}
}
