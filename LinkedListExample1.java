package com.java.LinkedList;

import java.util.LinkedList;

public class LinkedListExample1 {
	
	public static LinkedList<Integer> reverse(LinkedList<Integer> list) //function to store list values in [reversedList].
	{
		LinkedList<Integer> reversedList = new LinkedList<>();     
		while(!list.isEmpty()) {
			reversedList.addFirst(list.poll());
		}
		return reversedList;
		
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(); // 2nd list to initialize the values.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
	System.out.println("original List:" +list);
	LinkedList<Integer> reversedList = reverse(list);
	System.out.println("Reversed List:" + reversedList);

	}
	
	

}
