package com.java.Array;

public class ArrayExample1 {

	public static void main(String[] args) {
		int [][] numbers = { {1,2,3,4,},{5,6,7} };
		int i,j =0;
		for (i=0; i<=numbers.length; i++) {
			for(j=0; j<=numbers.length; j++) {
				System.out.println(numbers[i][j]);
				System.out.println("The length of Row:" +i);
				System.out.println("The length of Column:" +j);

			}
			
		}
	}

}
