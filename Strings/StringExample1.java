package com.java.StringPrograms;

public class StringExample1 {

	public static void main(String[] args) {
		String str1= new String("Muthu");
		String str2= new String("Muthu");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));

	}

}
//Essentially, equals() is a method, while == is an operator.
//The == operator can be used for comparing references (addresses) and the .equals() 
//method can be used to compare content. To put it simply, == checks if the objects point to the same memory location, 
//whereas .equals() compares the values of the objects.

//Is String a primitive or derived type in Java?
//Strings are derived data types. Strings are Java objects that represent sequences of characters. 
//String objects are created using the java.lang.String class. There are many functions that need to be called upon 
//when processing a string, such as substring(), indexof(), equals(), toUppercase(), etc, 
//which primitives types do not have.

//Java treats Strings as objects, not arrays. String objects in Java are immutable; 
//you cannot modify their contents. This means whenever we manipulate a String object, 
//the new String is created rather than the original string being modified.