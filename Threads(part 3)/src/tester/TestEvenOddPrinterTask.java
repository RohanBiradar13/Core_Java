package tester;

import java.util.Scanner;

import threadsasks.EvenPrinterTask;
import threadsasks.OddPrinterTask;

public class TestEvenOddPrinterTask {
	public static void main(String[] args) throws InterruptedException {
		try (Scanner sc = new Scanner(System.in)) {
			//System.out.println(Thread.currentThread().getName());
			System.out.println("Enter the start value");
			int start = sc.nextInt();
			System.out.println("Enter the end value");
			int end = sc.nextInt();

			Thread EvenTask = new Thread(new EvenPrinterTask(start, end), "EvenTask");
			Thread OddTask = new Thread(new OddPrinterTask(start, end), "OddTask");

			EvenTask.start();
			OddTask.start();
			//Thread.sleep(10);
			System.out.println("main is waiting for child threads to complete");
			EvenTask.join();
			OddTask.join();
			System.out.println("child threads are completed");
			System.out.println("main over...");

		}
	}
}
