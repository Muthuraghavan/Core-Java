package com.java.InterviewPrograms;

import java.util.Scanner;

public class PyramidProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in your Pyramid");
        int noOfRows = sc.nextInt();
        int RowCount = 1;
        System.out.println("Here is your pyramid");
        
        for(int i= noOfRows; i>0; i--) {
        	for(int j=1; j<=i; j++) {
        		System.out.print(" ");
        	}
        	for(int j=1; j<=RowCount; j++) {
        		System.out.print(RowCount+" ");
        		
        	}System.out.println();
        	RowCount++;
        	
        }
	}

}
