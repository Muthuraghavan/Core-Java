package com.java.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		List <Integer> arr = Arrays.asList(1,2,24,25,31,17,10);
		int sum, result, res, a, b;
		for(int i=0; i<=arr.size();) {
			result = arr.get(i);
			a = i;
			i++;        
			sum = result+ arr.get(i);
			res = arr.get(i);           
			b = i;                    
			System.out.println(sum);
			if(sum==26)
			{
				System.out.println("Awesome here we go:" +sum);
				System.out.println("First value associated with summation:" +result);
				System.out.println("Second value associated with summation:"+res);
				System.out.println("Index of first value:" +a);
				System.out.println("Index of Second value:" +b);
				
			}
			else {
				System.out.println("Looking for next values");
			}
			
		}
		
	}
}
