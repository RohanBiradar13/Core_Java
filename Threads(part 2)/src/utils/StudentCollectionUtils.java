package utils;

import static com.app.core.Subject.ANGULAR;
import static com.app.core.Subject.DBT;
import static com.app.core.Subject.DEVOPS;
import static com.app.core.Subject.JAVA;
import static com.app.core.Subject.REACT;
import static com.app.core.Subject.SE;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.core.Student;

public interface StudentCollectionUtils {
	static List<Student> populateData(){
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("dac-001", "Rama", parse("1999-01-01"), ANGULAR, 8.1));
		students.add(new Student("dac-009", "Tama", parse("1999-11-01"), JAVA, 9.1));		
		students.add(new Student("dac-002", "Mihir", parse("1998-01-11"), REACT, 8.3));
		students.add(new Student("dac-005", "Rekha", parse("1997-11-06"), JAVA, 7.1));
		students.add(new Student("dac-003", "Anish", parse("1999-01-21"), SE, 6.1));
		students.add(new Student("dac-004", "Rohan", parse("2000-01-01"), DEVOPS, 5.7));
		students.add(new Student("dac-006", "Timir", parse("1999-12-21"), DBT, 8.8));
		students.add(new Student("dac-007", "Tarun", parse("1997-03-21"), ANGULAR, 7.4));
		students.add(new Student("dac-010", "Priti", parse("1999-01-08"), JAVA, 8.9));
	
		return students;
	}
	//add static method which returns map
	static  Map<String,Student> populateData_Map(List<Student> studnets){
		Map<String,Student> studnetsMap = new HashMap<String, Student>();
		for(Student s : studnets) {
			studnetsMap.put(s.getRollNo(), s);
		}
		return studnetsMap;
		
	}

}
