package javaOverview;

public class Forloop {
	public static void main(String[] args) {
		int a=5;
		for(int i=0; i<=a; i++) {
			System.out.print(i +" ");
		}
		//enchanced for loop.
		String[] names = {"Vinu", "Muthu", "Forever"};
		for(String Names:names) {
			System.out.println("Name list: " +Names);
		}
		
	}

}

//The for loop is used when we know the number of iterations (we know how many times we want to repeat a task). 
//The for statement includes the initialization, condition, and increment/decrement in one line. 