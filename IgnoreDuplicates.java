package com.java.TreeSet;

import java.util.TreeSet;

public class IgnoreDuplicates {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(2);
		set.add(4);
		set.add(5);
		
		boolean isAdded = set.add(4);
		System.out.println("Was 4 added again:" + isAdded);
		System.out.println("set:" +set);

	}

}
