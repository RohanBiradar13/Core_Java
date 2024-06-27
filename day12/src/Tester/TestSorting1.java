package Tester;

import static utils.CollectionUtils.populateData;

import java.util.ArrayList;
import java.util.Collections;

import com.app.core.Emp;



public class TestSorting1 {

	public static void main(String[] args) {
		try{
			ArrayList<Emp> list =populateData();
			System.out.println("Orginal List");
			for(Emp e : list) {
				System.out.println(e);
			}
			Collections.sort(list);
			System.out.println("Sorted list as per emp id");
			for(Emp e : list) {
				System.out.println(e);
			}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
