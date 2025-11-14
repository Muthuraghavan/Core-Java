package com.java.LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeue {

	public static void main(String[] args) {
		Deque<String> Deq = new LinkedList<>();
		Deq.add("Kohli");
		System.out.println("Deque Elements:" +Deq);
		Deq.addFirst("King");
		System.out.println("After adding first element:" +Deq);
		Deq.addLast("Run Machine");
		System.out.println("Adding last element:" +Deq);
		Deq.removeFirst();
		Deq.removeLast();
		
		System.out.println("Final Deque:" +Deq);
	}

}
// To access an element, we need to iterate from the beginning to the element. 
// Implements List, Queue, and Deque interfaces., 
// Whenever an element is added, prev and next address are changed.
// Stores 3 values (previous address, data, and next address) in a single position.	
