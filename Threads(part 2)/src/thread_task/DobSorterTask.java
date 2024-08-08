package thread_task;

import static utils.IOUtils.writeData;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Stream;

import com.app.core.Student;

public class DobSorterTask implements Runnable {
	private Map<String, Student> students;
	private String fileName;

	public DobSorterTask(Map<String, Student> students, String fileName) {
		super();
		this.students = students;
		this.fileName = fileName;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		// students.values().stream().sorted(Comparator.comparing(s->s.getDob()));
		Stream sortedStudents = students.values().stream().sorted(Comparator.comparing(Student::getDob));
		try {
			writeData(sortedStudents, fileName);
			System.out.println("data is completely written by " + Thread.currentThread().getName());
		} catch (FileNotFoundException e) {
			System.out.println("err in " + Thread.currentThread().getName() + " " + e);
			System.out.println(Thread.currentThread().getName() + " over");
		}

	}
}
