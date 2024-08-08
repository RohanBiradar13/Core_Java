package threads1;

public class Tester {
 
	public static void main(String[] args) throws InterruptedException {
		//System.out.println(Thread.currentThread());//Thread[main,5,main]
		NewThread t1 = new NewThread("one");
		NewThread t2 = new NewThread("two");
		NewThread t3 = new NewThread("three");
		NewThread t4 = new NewThread("four");//creating thread objects and staring them
		
		for(int i=0; i<20; i++) {
			System.out.println("Exce counter # "+i+" exec by "+Thread.currentThread());
			Thread.sleep(700);
		}
		System.out.println("main over...");
		
		
		
		

	}

}
