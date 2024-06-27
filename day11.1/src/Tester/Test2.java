package Tester;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.app.core.Department;
import com.app.core.Emp;
import static com.app.core.Emp.sdf;
import static com.app.core.Department.*;
import CustomException.*;
public class Test2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Emp> empList = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Add emp to list 2.Display all emp 3. Get emp details by id 4.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter the details id, name, salaray, dept, joinDate");
                        empList.add(new Emp(sc.nextInt(), sc.next(), sc.nextDouble(), valueOf(sc.next().toUpperCase()), sdf.parse(sc.next())));
						break;

					case 2:
                        for(Emp e: empList) {
                        	System.out.println("All emp list: "+e);
                        }
						break;
					case 3:
						System.out.println("Enter the id of emp to get details: ");
						int index = empList.indexOf(new Emp(sc.nextInt()));
						if(index ==-1) {
							throw new EmployyeHandlingException("Invalid id");
						}
						System.out.println(empList.get(index));

						break;
					case 4:
						exit=true;

						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}

	}
}