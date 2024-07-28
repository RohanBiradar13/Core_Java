package tester;

import static utils.StudentCollectionUtils.populateData;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

import org.w3c.dom.css.CSSRule;

import static com.app.core.Subject.valueOf;
import com.app.core.Student;
import com.app.core.Subject;

public class TestStudent {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Student> students = populateData();
			boolean exit = false;
			while (!exit) {
			System.out.println("1.Display all studnets");
			System.out.println("3.Sort gpa of studnets ");
			System.out.println("3.Display sum of all gpa studnets for the specified subject");
			System.out.println("4.Display average of gpa of students for the specified subject");
			System.out.println("5.Display name of the specified subject topper");
			System.out.println("6.Exit");
		
				try {
					switch (sc.nextInt()) {
					case 1:
						students.forEach(System.out::println);
						break;

					case 2:
                        //.sorted(Comparator.comparing(s->s.getGpa())) -> this will also work
						students.stream().sorted(Comparator.comparing(Student::getGpa)).forEach(System.out::println);
						break;
					case 3:
						System.out.println("Enter the specified subject name");
						Subject subjectName = valueOf(sc.next().toUpperCase());
					
						double sumGpa = students.stream().filter(s -> s.getSubject().equals(subjectName)).
						mapToDouble(s->s.getGpa()).sum();
						System.out.println(sumGpa);
						break;
					case 4:
						System.out.println("Enter the specified subject name");
						 subjectName = valueOf(sc.next().toUpperCase());
					
						OptionalDouble averageGpa = students.stream().filter(s -> s.getSubject().equals(subjectName)).
						mapToDouble(s->s.getGpa()).average();
						System.out.println(averageGpa);
						break;
					case 5:
						System.out.println("Enter the specified subject name");
						subjectName = valueOf(sc.next().toUpperCase());
						OptionalDouble maxGpa =students.stream().filter(s->s.getSubject().equals(subjectName)).mapToDouble(Student::getGpa).max();
						System.out.println(maxGpa);
						break;
					case 6:
						exit = true;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
