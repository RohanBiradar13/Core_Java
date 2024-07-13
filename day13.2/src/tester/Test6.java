package tester;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Emp;

public class Test6 {

	public static void main(String[] args) {
	/*Collection class method
	 * public static <T> void sort(List<T> list, Comparator<? super T> comp)
	 * 
	 * will you be able to sort Vector<Emp> details using above method if Emp is not Comparable? : Yes
	 * can you pass Comparator<Mgr> : No(legal : Emp or it's super type)
	 */
		List<Emp> emps =  Arrays.asList(new Emp(),new Emp(),new Emp());
		/*
		 * Collections.sort(emps, new Comparator<Manager>() {
		 * 
		 * @Override public int compare(Manager o1, Manager o2) {
		 * 
		 * return 0; }
		 * 
		 * });
		 */
//this above code fails coz the public static <T> void sort(List<T> list, Comparator<? super T> comp)
		//the method wants  any lists as 1st argument which is acceptable but the 2nd argument is not acceptable coz super T(T-> Emp or it's super  type)
		//and our code 2nd argument is <Manager> is not super type 
		
		Collections.sort(emps, new Comparator<Emp>(){
			@Override
			public int compare(Emp e1, Emp e2) {
				return 0;
			}
		});
		System.out.println(emps);
	}

}
