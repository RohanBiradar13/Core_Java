package tester;

import java.util.Map;
import java.util.Scanner;
import static utils.StudentCollectionUtils.*;
import com.app.core.Student;

import thread_task.DobSorterTask;
import thread_task.GpaSorterTask;

public class TestCollectionIOStreamThreads {

	public static void main(String[] args) throws InterruptedException {
	try(Scanner sc = new Scanner(System.in)){
		Map<String,Student> students = populateData_Map(populateData());
		System.out.println("Enter dob sorter file name1");
		String fileName1 = sc.nextLine();
		System.out.println("Enter gpa sorter file name2");
		String fileName2 = sc.nextLine();
		
		Thread dobSorter = new Thread(new DobSorterTask(students, fileName1), "dobSorter");
		Thread gpaSorter = new Thread(new GpaSorterTask(students, fileName2), "gpaSorter");
		
		dobSorter.start();
		gpaSorter.start();
		System.out.println("main is waiting for child threads to complete");
		dobSorter.join();
		gpaSorter.join();
		System.out.println("child threads over");
		System.out.println("main over");
	}

	}

}
