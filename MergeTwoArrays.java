package com.java.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class MergeTwoArrays {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(7,8,9,2,1));
		ArrayList<String> list3 =  new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry", "Mango"));
		Set<Integer> set = new LinkedHashSet<Integer>(list1);
		list2.remove(1);
		System.out.println("After removing:" +list2);
		list1.addAll(list2);
		System.out.println("Merged ArrayList:" +list1);
		list1.retainAll(list2);
		System.out.println("Common elements in both Arrays:" +list1);
		Collections.sort(list3);
		System.out.println("String Array elements:" +list3);

		
		int max = Collections.max(list1);
		int min = Collections.min(list1);
		System.out.println("Maximum value in the Array:" +max);
		System.out.println("Minimum value in the Array:" +min);
	}

}
