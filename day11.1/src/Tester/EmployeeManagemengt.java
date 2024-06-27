package Tester;

import java.text.ParseException;
import java.util.ArrayList;
import static utils.CollectionUtils.populateData;
import java.util.Date;
import java.util.Scanner;

import com.app.core.Department;
import com.app.core.Emp;

import CustomException.EmployyeHandlingException;

import static com.app.core.Department.*;
import static com.app.core.Emp.sdf;

public class EmployeeManagemengt {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Emp> emplist = populateData();
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Add emp to list 2.Display all emp list 3.Get details by empId "
						+ "4.Update Emp salary & department by their id 5.Delete emp by their id "
						+ "& return the emp details of deleted emp 6.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
                         System.out.println("Enter the details : id, name, salaray, dept, joinDate");
                         emplist.add(new Emp(sc.nextInt(), sc.next(), sc.nextDouble(), valueOf(sc.next().toUpperCase()), sdf.parse(
                        		 sc.next())));
                         
						break;

					case 2:
                         for(Emp e: emplist) {
                        	 System.out.println("Details of all emp list"+e);
                         }
						break;
					case 3:
						System.out.println("Details of emp by id");
						int index=emplist.indexOf(new Emp(sc.nextInt()));
						if(index==-1) {
							throw new EmployyeHandlingException("Invalid id");
						}
						System.out.println(emplist.get(index));

						break;

					case 4:
						System.out.println("Update the Salary & Department of emp by id ");
						System.out.println("Enter id, increment salary and department ");
						index=emplist.indexOf(new Emp(sc.nextInt()));
						if(index==-1) {
							throw new EmployyeHandlingException("Invalid id");
						}
						double incrementSalary =sc.nextDouble();
						Department dept=valueOf(sc.next().toUpperCase());
						Emp e = emplist.get(index);
						e.setSalaray(e.getSalaray()+incrementSalary);
						e.setDept(dept);
						System.out.println("Emp details updated");
						
						

						break;

					case 5:
                        System.out.println("Enter the id of emp which you want to delete");
                        index=emplist.indexOf((new Emp(sc.nextInt())));
                        if(index == -1) {
                        	throw new EmployyeHandlingException("Invalid id");
                        }
                        System.out.println("Deleted emp details"+emplist.remove(index));
						break;
					case 6:
						exit=true;
						break;

					}
				} catch (Exception e) {
					System.out.println(e);
				}sc.nextLine();

			}
		} catch (ParseException e1) {
			
			e1.printStackTrace();
		}
	}
}