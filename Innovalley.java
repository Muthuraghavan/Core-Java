package com.java.InterviewPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Innovalley {

	public static void main(String[] args) {
		List<Character> list= Arrays.asList('i','n','n','o','v','a','l','l','e','y');
		Set<Character> list1 = new HashSet<Character>();
		char a;
		char b = 0;
		for(int i=0; i<list.size()-1; i++) {
			a = list.get(i);
			for(int j=i+1; j<list.size(); j++) {
				b = list.get(j);
				if(a==b) {
					list1.add(a);
					System.out.println(list1);
					break;
				}
				
			}
			
		}
				 
	}
}
	


