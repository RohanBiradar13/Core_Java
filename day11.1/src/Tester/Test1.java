package Tester;

import static com.app.core.Department.valueOf;
import static com.app.core.Emp.sdf;




import java.util.ArrayList;
import java.util.Scanner;

import com.app.core.Emp;


public class Test1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			ArrayList<Emp> empList= new ArrayList<>();
			System.out.println("Enter the details: id, name, salaray, dept, joinDate");
			empList.add(new Emp(sc.nextInt(), sc.next(), sc.nextDouble(), valueOf(sc.next().toUpperCase()),sdf.parse(sc.next())));
			System.out.println("Emp List: "+empList);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
