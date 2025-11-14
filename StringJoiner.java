package com.java.StringPrograms;


public class StringJoiner {

	public static void main(String[] args) {
		StringJoiner joinStrings = new StringJoiner(",","[","]");
		joinStrings.add("Muthuraghavan");
		joinStrings.add("Lord");
		joinStrings.add("Commander");
		System.out.println(joinStrings);
	}

}
