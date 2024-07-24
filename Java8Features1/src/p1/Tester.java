package p1;

public class Tester {

	public static void main(String[] args) {
		Formula f1 = new MyFormula();//i/f ref can directly ref to impl instyance
		System.out.println(f1.calculate(100));
		System.out.println(f1.sqrt(11, 12));
		System.out.println("----------------------");
		f1=new AnotherFormula();
		System.out.println(f1.calculate(100));
		System.out.println(f1.sqrt(12, 13));
		

	}
 
}
