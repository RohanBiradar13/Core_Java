package p6;

public class Tester {
public static void main(String[] args) {
	MyImplements m= new MyImplements();
	if(m.test(4)) {
		System.out.println("something is there");
	}else {
		System.out.println("Nothing is there");
	}
	
	m.print("HI Man");
	I3 i= new MyImplements();//In I3 interface there is only print method after that 
	//show and test method are working bcoz I3 extends from I1 and I2.
	//this is working because I3 interface is extending
	//from I2 and I1
	i.print("Hi");
	i.show();
	i.test(4);
	I2 i2= new MyImplements();//in I2 interface there no test method so compiler gives error
	//i2.test(4);
	
}
}
