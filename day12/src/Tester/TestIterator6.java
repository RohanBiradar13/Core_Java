package Tester;

import java.util.ArrayList;
import java.util.ListIterator;
import static utils.CollectionUtils.populateData;
import com.app.core.Emp;

public class TestIterator6 {

	public static void main(String[] args) {
		try {
			ArrayList<Emp> list = populateData();
			System.out.println("List Data on Order ->Original");
			for(Emp e : list) {
				System.out.println(e);
			}
			//display emp details in reverse order
			System.out.println("Reverse list");
			ListIterator<Emp>litr = list.listIterator(list.size());
			while(litr.hasPrevious())
				System.out.println(litr.previous());
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
