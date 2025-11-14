package com.java.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>(
				Arrays.asList(1,2,3,4,5,6,7,1,2,3));
		System.out.println("Arrays with Duplicates:" +list);
		Set <Integer> set = new LinkedHashSet<>(list); // gets values from list to set.set here is to remove duplicates;
		list.clear(); // Which empties the entire list.
		list.addAll(set); // Adding the values again to list from set.
		System.out.println("ArrayList without Duplicates:" +list);
		
		}

}
