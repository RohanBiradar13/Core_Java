package tester;

import static com.code.Department.*;
import static com.code.Employee.sdf;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import com.code.Employee;



public class TestEmp {

	public static void main(String[] args) {
		try(Scanner sc =new Scanner (System.in)){
			ArrayList<Employee>empList = new ArrayList<>();
			System.out.println("Enter emp details : id, name, salary, deptID, dob(dd-mm-yy)");
			empList.add(new Employee(sc.nextInt(), sc.next(), 
					sc.nextDouble(), valueOf(sc.next().toUpperCase()), 
					null));
			System.out.println(empList);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
