package tester;

import java.util.Scanner;

public class UncheckedException {
public static void main(String[] args) {
	try {
		Scanner sc=null;
		System.out.println(sc.nextInt());
	int data[]= {1,2,3,4,5};
	System.out.println(data[4]);
	
	//->compiler does not give us error when we write it but when we run it got runtime exception
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
//	at tester.UncheckedException.main(UncheckedException.java:6)
// to avoid that exception either write try-catch block or throwable
	String s = "1234a";
	System.out.println("parsed integer "+Integer.parseInt(s));
	System.out.println("end of try block");
	}
	//gives java.lang.NumberFormatException: For input string: "1234a"
	/*}catch(ArrayIndexOutOfBoundsException a) {
		System.out.println("errro 1");
	}
	catch (NumberFormatException n) {
		System.out.println("error2");
	}*/
	catch (ArrayIndexOutOfBoundsException| NumberFormatException e) {
		System.out.println("in multi-catch"+e);//e.toString
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("end of main");
}

}
