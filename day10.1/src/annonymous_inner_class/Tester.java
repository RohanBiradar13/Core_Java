package annonymous_inner_class;

public class Tester {

	public static void main(String[] args) {
		Printable p = new MyPrintable();//Up casting
		p.print("Some message");
        //anonymous inner class: using i/f
		Printable p2=new Printable() {
			//new Printable()=>instance of anonymous inner class which implements Printable
			@Override
			public void print(String mesg) {
				System.out.println("in annonymous inner class"+mesg);
				
			}

			@Override
			public double calc(double d1, double d2) {
				// TODO Auto-generated method stub
				return d1*d2;
			}
			
		};
		System.out.println(p2.calc(2, 4));
		Printable p3=new MyPrintable();
	    ((MyPrintable)p3).compute(4, 7);
	}
     
}
