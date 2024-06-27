package Tester;

import static utils.CollectionUtils.populateData;

import java.util.ArrayList;
import java.util.Iterator;

import com.app.core.Emp;

public class TestIterator5 {

	public static void main(String[] args) {
		
		try {
			ArrayList<Emp>list=populateData();
			System.out.println(list.size());
				
			Iterator<Emp> itr = list.iterator();
			while(itr.hasNext()) {
				//itr.next();
				itr.remove();//IllegalStateException next() must be called before remove()
			}
			 
			System.out.println(list);	
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
