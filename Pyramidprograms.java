package com.java.InterviewPrograms;

import java.util.Scanner;

public class Pyramidprograms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many rows you want in pyramid");
		int noOfRows = sc.nextInt();
		int rowCount = 1;
		System.out.println("Here is the pyramid");
		
		for(int i=noOfRows; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
				// print the spaces at the beginning of each Row.
				}
			for(int j=1; j<=rowCount; j++) {
				System.out.print(j+" ");
			}	// printing rowCount value 'rowCount' times at each Row.
			System.out.println();
			rowCount++;
	}
	}
}
