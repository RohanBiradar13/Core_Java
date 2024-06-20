package annonymous_inner_class;

public class MyPrintable implements Printable,Computable {

	@Override
	public void print(String mesg) {
		System.out.println("printing a mesg"+mesg);

	}

	@Override
	public double calc(double d1, double d2) {
		// TODO Auto-generated method stub
		return d1*d2;
	}

	@Override
	public int compute(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	
 
}
