package p5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		// display elements using anonymous inner class
		// Iterable method
		// default void forEach(Consumer <? super T> consumer), T : type of the
		// colletion
		/*
		 * list.forEach(new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) { System.out.println(t);
		 * 
		 * }
		 * 
		 * });
		 */
		list.forEach(t -> System.out.println(t));// declarative functional programming style
		System.out.println("-------------------- ");
		// display squares of the elements of the list
		list.forEach(t -> System.out.println(t * t));
	}

}
