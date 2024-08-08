package thread5;

import static java.lang.Thread.*;

public class Tester2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(currentThread().getName() + " started");
		/*
		 * This will also work but we want to use lamda Thread t1 = new Thread(new
		 * Runnable() {
		 * 
		 * @Override public void run() {
		 * System.out.println(currentThread().getName()+" started"); try { sleep(5000);
		 * System.out.println("2"); }catch (Exception e) { e.printStackTrace(); }
		 * System.out.println(currentThread().getName()+" over"); } }, "t1");
		 */
		Thread t1 = new Thread(() -> {
			System.out.println(currentThread().getName() + " started");
			try {
				sleep(5000);
				System.out.println("2");
			} catch (Exception e) {
				System.out.println("err in " + currentThread().getName() + e);
			}
			System.out.println(currentThread().getName() + " over");
		}, "t1");
		t1.start();
		System.out.println("1");
		t1.join(2000);// wait till t1 is over with 2 sec
		System.out.println("3");
		System.out.println("main thread over.....");
	}

}
