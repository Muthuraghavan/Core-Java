package com.java.InterviewPrograms;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter input string needs to be removed white space");
		String inputString = sc.nextLine();
		String stringwithoutSpaces = inputString.replaceAll("\\s+", "");
		System.out.println("Input String:" +inputString);
		System.out.println("Input String withoutSpaces:" +stringwithoutSpaces);

	}

}

//In the first method, we use replaceAll() method of String class to remove all white spaces (including tab also) 
//from a string. This is one of the easiest method to remove spaces from string in java. replaceAll() method takes 
//two parameters. One is the string to be replaced and another one is the string to be replaced with. 
//We pass the string “\\s+” to be replaced with an empty string “”. This method removes spaces at the end, 
//spaces at the beginning and spaces between the words.
