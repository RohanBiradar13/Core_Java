package Tester;

import static utils.CollectionUtils.populateData;

import java.util.ArrayList;
import java.util.Iterator;

import com.app.core.Emp;

public class TestIterator1 {

	public static void main(String[] args) {
		//display emp details using iterator
		try {
			ArrayList<Emp>list=populateData();
			System.out.println(list.size());
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			//System.out.println(itr.next());->NoSuchElementFound Exception
				
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
