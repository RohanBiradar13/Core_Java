package wrapper;

public class Test {
	public static void main(String[] args) {
		int data = 123;
		Integer i1 = Integer.valueOf(data);// boxing done by programmer explicitly
		// boxing->primitive type to wrapper
		// unboxing->wrapper to primitive
		int value = i1.intValue();// unboxing done by programmer explicitly
        Integer i2=1234;//auto boxing
        value=i2;//auto unboxing done by compiler
        String s="hello";
        s+=10;
        System.out.println(s);
        //s++
        //s*2=10;
        i2++;//auto unboxing(Integer->int) ---increment(int)--->auto boxing
        System.out.println(i2);//1235
        Double d1=1234.56;//auto boxing
        double data2=d1;//auto unboxing
        data2=data;//automatic promotion(widening):javac(int--->double)
        //d1=1234; int--->Integer(auto boxing)----X---->Double
        d1=(double)1234;//double--->Double(auto boxing)
        data2=123.445F;//widening
        //d1=12.34F; float--->Float -----x-----Double
        Number n1=123.35;//auto boxing double--->Double -->Number(Upcasting)
        Object ref="hello";//upcasting
        ref=true;//boolean-->Boolean(auto boxing)---Object(upcating)
        ref=1234.F;//float--->Float----->Object(ref)-->(upcasting)
        
        
        
        
        
	}

}
