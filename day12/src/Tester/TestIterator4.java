package Tester;

import static utils.CollectionUtils.populateData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.app.core.Emp;

public class TestIterator4 {

	public static void main(String[] args) {
		// display emp details using iterator
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Emp> list = populateData();
			System.out.println("List Data");
			for (Emp e : list) {

				System.out.println(e);
			}
			System.out.println("Enter the threshould salary");
			double sal = sc.nextDouble();

			Iterator<Emp> itr = list.iterator();
			while(itr.hasNext())
				if(itr.next().getSalaray()>sal)
					itr.remove();
			
			System.out.println("List data after removal");
			for (Emp e : list) {

				System.out.println(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
