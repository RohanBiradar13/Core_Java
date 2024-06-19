package tester;

public class CheckedException {
public static void main(String[] args) {
	System.out.println("before");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	//javac forces the to handle exception for checked exception.
	//we are doing exception in here bcoz in multi-threading there are many threads then 
	//any thread can interrupt current thread
	System.out.println("after");
	System.out.println("end of main");
}
}
