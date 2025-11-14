package com.java.HashSet;

import java.util.HashSet;

public class HashSetExample1 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {4,5,6,7};
		
		HashSet<Integer> set1 = new HashSet<>();
		for (int num:arr1) {
			set1.add(num);
		}
		
		HashSet<Integer> intersection = new HashSet<>();
		for (int num:arr2) {
			if(set1.contains(num)) {
				intersection.add(num);
			}
		}System.out.println("To find the Intersection/Common elements:" +intersection);

	}

}
