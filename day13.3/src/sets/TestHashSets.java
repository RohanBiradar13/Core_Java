package sets;

import java.util.HashSet;

public class TestHashSets {

	public static void main(String[] args) {
		HashSet<Integer> intSet = new HashSet<>();
		int[] data = {23,1,234,45,-10,1,23,56,78};
		//populate the set from array
		
		for(int i : data) {
			System.out.println("Added"+intSet.add(i));//javac impl auto boxing(int->Integer)
		}
		System.out.println(intSet);//no dups! unsorted, unordered 
		System.out.println(intSet.size());//7
		System.out.println(intSet.contains(234));//true
		System.out.println(intSet.remove(1234));//false
	} 

}
