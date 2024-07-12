package tester;

import static utils.CollectionUtils.populateData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.app.core.Emp;

import custom_ordering.EmpSalaryComparator;

public class TestEmpSorting3 {

	public static void main(String[] args) {
		try {
			ArrayList<Emp> empdata = populateData();
			System.out.println("Orginal List");
			for(Emp e : empdata) {
				System.out.println(e);
			}
			
			Collections.sort(empdata, new Comparator<Emp>() {
				@Override
				public int compare(Emp e1, Emp e2) {
					int returnValue = e1.getJoinDate().compareTo(e2.getJoinDate());
					if(returnValue == 0) {
					return ((Double)e1.getSalaray()).compareTo(e2.getSalaray());
					}
	             return returnValue;
				}
			});
			
		
			System.out.println("Custom Sorted List using annonymous inner class Comparator");
			for(Emp e : empdata) {
				System.out.println(e);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
