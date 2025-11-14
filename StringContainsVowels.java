package com.java.InterviewPrograms;

public class StringContainsVowels {

	public static void main(String[] args) {
		System.out.println(stringContainsVowels("Muthu"));
		System.out.println(stringContainsVowels("Raghavan"));
		}
	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

	
}
