package com.java.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargest {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,25,24,31,17,10));
		Collections.sort(list, Collections.reverseOrder()); // sorts the list in [31, 25, 24, 17, 10, 2, 1]..
		System.out.println(list);
		int largest = list.get(0); // Saves the largest value 
		System.out.println(largest);
		for(int i=1; i<list.size(); i++) {
			if(list.get(i) != largest) {
				System.out.println("Second largest element:" +list.get(i));
				break;
			}
		}

	}

}
