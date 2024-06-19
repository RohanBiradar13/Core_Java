package tester;

import java.util.Scanner;

import com.app.org.Employee;
import com.app.org.Manager;
import com.app.org.Worker;

public class TestOrganization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of employees:");
        Employee[] employees=new Employee[sc.nextInt()];
       
        boolean exit=false;
        int counter=0;
        while(!exit) {
        	 System.out.println("1.Hire Manager 2.Hire Worker 3.Display information of all employees including net salary if it's manager"
             		+ "display it's performance bonus and if it's worker display it's hourly rate  ");
        	switch (sc.nextInt()) {
			case 1:
				if(counter<employees.length) {
				System.out.println("Enter the details: id, name, deptId, basic, performanceBonus");
				employees[counter++]=new Manager(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble());
				}else {
					System.out.println("The capacity is full..");
				}
				break;

			case 2:
				if(counter<employees.length) {
				System.out.println("Enter the details: id, name, deptId,basic, hoursWorked, hourlyRate");
				employees[counter++]=new Worker(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(),sc.nextInt(), sc.nextDouble());		
				}else{
					System.out.println("The capacity is full..");
				
				}
				
				break;
				
			case 3:
				System.out.println("All the employess details");
				for(Employee e: employees) {
				System.out.println(e+"salaray of the employee is: "+e.computeNetSalaray());	
				}
			}
        }
		
	}

}
