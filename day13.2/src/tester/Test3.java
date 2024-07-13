package tester;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class Test3 {

	public static void main(String[] args) {
		//Methods of collection class : public static void shuffle(List<?> list)
		//Use above method to shuffle AL/LL/Vector of Strings
		
		List<String> list = Arrays.asList("one","two","three","four","five");
		Collections.shuffle(list);
		System.out.println(list);//shuffled list
		
		//can you us above method to shuffle LinkedList<Integer> : Yes
		
		LinkedList<Integer> list2 = new LinkedList<> (Arrays.asList(1,2,3,4,5));
		list2.add(0,99);//we can add here coz above LL is growable data structure=>(new LinkedList<> (Arrays.asList(1,2,3,4,5))); 
		System.out.println(list2);
		//shuffle
		Collections.shuffle(list2);
		System.out.println(list2);
		

	}

}
