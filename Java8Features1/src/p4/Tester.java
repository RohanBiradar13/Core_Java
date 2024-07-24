package p4;
import static p4.utils.testCompute;
public class Tester {

public static void main(String[] args) {
	System.out.println(testCompute(5, 4, new Computable() {
		
		@Override
		public double compute(double a, double b) {
			
			return a+b;
		}
	}));
	System.out.println(testCompute(5, 4, new Computable() {
		
		@Override
		public double compute(double a, double b) {
			
			return a-b;
		}
	}));
	//FP : declarative style of program
	//perform multi on 2 numb
	//double compute(double a, double b);higher order function coz it has an argument(3rd argument) where
	//we are accepting a behavior(returning a behavior) 
	//testCompute -> 
	/*
	 * System.out.println(testCompute(10, 20, (double a, double b) -> { return a*b ;
	 * }));
	 */
	//we can reduce this code 
	System.out.println(testCompute(10,20 , (a,b)-> a*b));
}

	}


