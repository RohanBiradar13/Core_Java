package threads3;

public class Tester {
 
	public static void main(String[] args) throws InterruptedException {
		//System.out.println(Thread.currentThread());//Thread[main,5,main]
		NewThread t1 = new NewThread("one");
		NewThread t2 = new NewThread("two");
		NewThread t3 = new NewThread("three");
		NewThread t4 = new NewThread("four");//creating thread objects and staring them
		
		for(int i=0; i<10; i++) {
			System.out.println("Exce counter # "+i+" exec by "+Thread.currentThread());
			Thread.sleep(200);
		}
		System.out.println("main is waiting for child threads to complete");
		System.out.println(t1.isAlive()+" "+t2.isAlive()+" "+t3.isAlive()+" "+t4.isAlive());//All true
		t1.join();//main is waiting for t1 thread to complete
		t2.join();
		t3.join();
		t4.join();//main is waiting for t4 thread to complete
		System.out.println(t1.isAlive()+" "+t2.isAlive()+" "+t3.isAlive()+" "+t4.isAlive());//All false
		System.out.println("main over...");
		
		
		//in this package of threads our child threads blocks(sleep) for 500ms and
		//our main thread blocks for 200ms so main will over first and then child threads over
		//this will not a good practice of writing a code in real world
		//and give rise to many exceptions such as if we are writing or reading a file then if 
		//our main thread is over then how can our ramiaming operations of reading or writing
		//will lead to IO exceptions
		//So main thread must ends at last and child threads exceutes first
		

	}

}
