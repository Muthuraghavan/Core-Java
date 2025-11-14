package com.java.arraylist;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
			ArrayList<Integer> a= new ArrayList<>();
			a.add(1);
			a.add(2);
			a.add(3);
			a.add(4);
			
			System.out.println("Original list: "+a);
			System.out.println("size of array:" +a.size());
			a.removeFirst();
			a.removeLast();
			System.out.println("size of array:" +a.size());
			System.out.println("After removing list: "+a);
			a.add(0, 25);
			a.add(2, 1);
			System.out.println("Adding new variables: "+a);
			int i=0; int val=3;
			for(i=0; i<=a.size(); i++){
				if(val<=a.size()) {
					System.out.println(a);
					val++;
				}
			}
		}
	}

// Implements List interface.
// Stores a single value in a single position., Provides a resizable array implementation.
// Whenever an element is added, all elements after that position are shifted.
// Can randomly access elements using indexes.



