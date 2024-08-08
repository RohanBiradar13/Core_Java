package threads4;

public class Tester {
 
	public static void main(String[] args) throws InterruptedException {
		//System.out.println(Thread.currentThread());//Thread[main,5,main]
		//invoke NewThread's constructor to create and start threads
		RunnableTask task = new RunnableTask();//how many ruunable threads exists in the JVM ? : 1(main)
		//Create threads by attching runnable task(Runnable instance -> RunnableTask is a Runnable(implements)
		//Thread(Runnable instance, String name)
		Thread t1 = new Thread(task, "one");
		Thread t2 = new Thread(task, "two");
		Thread t3 = new Thread(task, "three");
		Thread t4 = new Thread(task, "four");//how many ruunable threads exists in the JVM ? : 1(main) and child threads are just created
		//start child threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//t2.start();//It's already Runnable : IllegalThreadException
		
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
