package com.java.InterviewPrograms;

import java.util.stream.Stream;

public class ReverseString {
	
	
		public static void main(String[] args) {
			String str = "MyJavaa";
			char[] strArray = str.toCharArray();
			for(int i = strArray.length-1; i>=0; i--) {
				System.out.println(strArray[i]);
			}
			
		}
		
	}

//public static void main(String[] args) {
//		StringBuffer sbf = new StringBuffer("Raghavan");
//		System.out.println(sbf.reverse());

	



