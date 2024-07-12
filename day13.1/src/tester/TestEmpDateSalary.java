package tester;

import static utils.CollectionUtils.populateData;

import java.util.ArrayList;
import java.util.Collections;

import com.app.core.Emp;

import custom_ordering.EmpDateSalaryComparator;

public class TestEmpDateSalary {

	public static void main(String[] args) {
		try {
			ArrayList<Emp> empdata = populateData();
			System.out.println("Orginial List");
			for(Emp e : empdata) {
				System.out.println(e);
			}
			System.out.println("Sorted List As Per Custom Ordering(Comparator->compare)..");
			Collections.sort(empdata, new EmpDateSalaryComparator());
			for(Emp e : empdata) {
				System.out.println(e);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
