package com.java.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample3 {

	public static void main(String[] args) {
		List <Integer> number = Arrays.asList(1,2,24,25,31,17,10);
		System.out.println("List of array elements:" +number);
		Iterator<Integer> itr = number.iterator();
		while(itr.hasNext()) {
			int a = (Integer)itr.next();
			System.out.println(a);
			if(a>25) {
				itr.remove();
			}
			
		}
		System.out.println("Modified List of array:" +number);

	}

}
