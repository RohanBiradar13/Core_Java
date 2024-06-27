package Tester;

import static com.app.core.Emp.sdf;
import static utils.CollectionUtils.populateData;
import static com.app.core.Department.valueOf;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.app.core.Department;
import com.app.core.Emp;

public class TestIterator2 {

	public static void main(String[] args) {
		//display emp details using iterator
		try(Scanner sc = new Scanner(System.in)) {
			ArrayList<Emp>list=populateData();
			//Display emp names from a specific department, joined after a specific date
			
			System.out.println("List Data");
			for(Emp e :list) {
				
				System.out.println(e);
			}
			System.out.println("Enter the  department and specific date");
			Department d = valueOf(sc.next().toUpperCase());
			Date specificDate=sdf.parse(sc.next());
			Iterator<Emp> itr = list.iterator();
			
			while(itr.hasNext()) {
				Emp e = itr.next();
				if(e.getDept().equals(d) && e.getJoinDate().after(specificDate)) {
					System.out.println(e);
				}
			}
			
				
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
