package com.java.arraylist;

import java.util.ArrayList;

public class ArrayListExample4 {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.ensureCapacity(25);
		s.add("Muthu");
		s.add("Raghav");
		s.add("Sun");
		s.add("Moon");
		System.out.println(s);
		int i, a;
		String word;
		for(i=0; i<=s.size();i++)
		{
			word = s.get(i);
			a=i;
			if(word=="Moon") {
				System.out.println("String matches with:" +word);
				System.out.println("Index of the String:" +i);
				s.remove(i);
				s.add(i, "Star");
				System.out.println(s);
			}else {
				System.out.println("Look for next String");
				
			}
		}
	}

}
