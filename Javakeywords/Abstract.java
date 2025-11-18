package JavaKeywords;

public abstract class Abstract {
	public String fname = "Vinu";
	public int age = 23;
	public abstract void study(); //abstract method
	
} class Student extends Abstract {
	public int graduationYear = 2015;
	public void study() { //body of the abstract method is provided here
		System.out.println("Studying all day long");
	}
	
}
class Second{
	public static void main(String[] args) {
		// create an object of inherited Student class(which inherits attributes and methods from main. 
		Student myObj = new Student();
		System.out.println("Name:" + myObj.fname);
		System.out.println("Age:" + myObj.age);
		System.out.println("GraduationYear:" + myObj.graduationYear);
		myObj.study(); //call abstract method.
	}
	
}

//A non-access modifier. Used for classes and methods: An abstract class cannot be used to create objects (to access it, it must be inherited from another class). An abstract method can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from)
//
