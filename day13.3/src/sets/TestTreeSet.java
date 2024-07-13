package sets;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> intSet = new TreeSet<>();
		int[] data = {23,1,234,45,-10,1,23,56,78};
		//populate the set from array
		
		for(int i : data) {
			System.out.println("Added"+intSet.add(i));//javac impl auto boxing(int->Integer)
		}
		System.out.println(intSet);//no dups! sorted as per natural ordering(Comparable->compareTo), unordered 
		//During the population of this TreeSet, JVM will invoke which classes : Integer, which method for sorting? "compareTo"
		System.out.println(intSet.size());//7
		System.out.println(intSet.contains(234));//true
		System.out.println(intSet.remove(1234));//false
	} 

}
