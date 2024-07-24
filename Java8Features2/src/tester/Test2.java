package tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Test2 {

	public static void main(String[] args) {
		// Method of Collection i/f
		// public boolean removeIf(Predicate< ? super T> filter)
		// SAM : public boolean test(T o)
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("one", "two", "three", "four", "five","six"));
		// remove all strings starting with letter 't'
		list.removeIf(p -> (p.startsWith("t")));
		list.forEach(p -> System.out.println(p));
		System.out.println("----------");

		list.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String t) {
             if(t.startsWith("o"))
				return true;
			return false;
			}

		});
		list.forEach(p -> System.out.println(p));
		System.out.println("----------");
list.removeIf(s->{if(s.startsWith("f"))
	return true;
return false;
		});
	
	list.forEach(p -> System.out.println(p));
}
}
