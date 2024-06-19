package nested_class;

public class Test {
public static void main(String[] args) {
	//how to invoke non static method of the inner class
	//Inner i1= new Inner(10);can not create instance of the inner class directly
	Outer outer = new Outer(10);//outer class reference outer class instance
	Outer.Inner inner = outer.new Inner(12);//inner class instance enclosed within outer class instance
	//invoking outer's class non static method
	outer.display();
	//invoking outer's static method
	Outer.show();
	//how to invoke non-static method of inner class
	inner.innershow();
	
}
}
