package com.java.TreeSet;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SortingIntegers {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(9);
		numbers.add(4);
		numbers.add(2);
		numbers.add(5);
		
		System.out.println("Sorted Numbers:" +numbers);
    
		List<Integer> list = Arrays.asList(2,5,4,9,1,3,7,3);
		System.out.println(list);
		TreeSet<Integer> set = new TreeSet<>(list);
		System.out.println("List without Duplicates:" +set);
		System.out.println("First element:" +set.first());
		System.out.println("Last element:" + set.last());
		System.out.println("Subset:" + set.subSet(2, 9));
		
	}

}
