package com.java.InterviewPrograms;

import java.lang.reflect.Array;

public class EqualityofArrays {

	public static void main(String[] args) {
		int [] arrayOne = {2,5,1,3,7};
		int [] arrayTwo = {2,5,1,3,7};
		boolean equalOrNot = true;
		if(arrayOne.length == arrayTwo.length) {
			for (int i=0; i<=arrayOne.length; i++) {
				if(arrayOne[i] != arrayTwo[i]) {
					equalOrNot = false;
				}
			}
		}else {
			equalOrNot = false;
		}
		if (equalOrNot = true) {
			System.out.println("two arrays are equal");
		}else {
			System.out.println("two arrays are not equal");
		}
	}

}
