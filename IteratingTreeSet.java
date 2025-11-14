package com.java.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class IteratingTreeSet {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
