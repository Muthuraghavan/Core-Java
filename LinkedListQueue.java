package com.java.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("Muthu");
		queue.add("Raghavan");
		queue.add("Kumari");
		queue.add("Ragavi");
		
		String str1 = queue.peek(); //To access the first element.
		System.out.println("Accessed Element:" +str1);
		String str2 = queue.poll(); //To remove the first element.
		System.out.println("Removed Element:" +str2);
		System.out.println("After removing queue:" +queue);
		
		queue.offer("Velmurugan"); //To add the element at the end.
		System.out.println("Adding the element in Queue:" +queue);
		
		}
}
