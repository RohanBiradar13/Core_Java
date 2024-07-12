package generic_method;

import java.util.Arrays;
import java.util.List;

import com.app.core.Emp;

public class Test1 {

	public static void main(String[] args) {
		//create an empty fixed size of integers
		List<Integer> list1 = Arrays.asList();
		System.out.println(list1);
		//list1.add(100);//run time error ==> java.lang.UnsupportedOperationException
		//fixed size list so no modification => add or remove
		//int[] data = {10,20,30,40,50};
		//List<Integer> list2 = Arrays.asList(data);
		//this above line gives compiler error coz we can't convert int array to Interger array
		//we can convert int value to Integer value but not to array part.
		Integer[] data = {10,20,30,40,50};
		List<Integer> list2 = Arrays.asList(data);
		System.out.println(list2);
		//list2.remove(0);run time error ==> java.lang.UnsupportedOperationException
		List<Integer>list3 = Arrays.asList(10,2,4,6);
		System.out.println(list3);
		list3.set(0, 12345);
		System.out.println(list3);
	}

}
