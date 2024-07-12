package tester;

import static utils.CollectionUtils.populateData;

import java.util.ArrayList;
import java.util.Collections;

import com.app.core.Emp;

import custom_ordering.EmpSalaryComparator;

public class TestEmpSalary {

	public static void main(String[] args) {
		try {
			ArrayList<Emp> empdata = populateData();
			System.out.println("Orginal List");
			for(Emp e : empdata) {
				System.out.println(e);
			}
			System.out.println("Using Natural Ordering(Comparable->compareTo)...");
			Collections.sort(empdata);
			for(Emp e : empdata) {
				System.out.println(e);
			}
			Collections.sort(empdata, new EmpSalaryComparator());
			System.out.println("Custom Sorted List using Comparator");
			for(Emp e : empdata) {
				System.out.println(e);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
