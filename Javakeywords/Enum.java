package JavaKeywords;

public class Enum {
	public static void main(String[] args) {
		enum Level{ //constants (unchangeable variables)
			low,
			medium,
			high
		}
		Level myVar = Level.medium;
		System.out.println(myVar);
		
	}
	

}

//The enum keyword declares an enumerated (unchangeable) type.
//
//An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
//
//To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters.


//Difference between Enums and Classes
//An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).
//
//An enum cannot be used to create objects, and it can not extend other classes (but it can implement interfaces).
//
//Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.