package com.java.HashSet;

import java.util.HashSet;

public class HashSetToRemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,5,4,3,2,1};
		System.out.println("Array elements with Duplicates:" +arr);
		HashSet<Integer> uniqueElements = new HashSet<>();
		for(int num:arr) {
			uniqueElements.add(num);
		}
		System.out.println("Array after Removing Duplicates:" +uniqueElements);

	}

}
