package JavaKeywords;

public class Assert {
	public static void main(String[] args) {
		//Enable assertions
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		loader.setDefaultAssertionStatus(true);
	
	//run the assert example
	AssertExample example = new AssertExample();
	example.run();}
}

class AssertExample {
	  public void run() {
		    int a = 12;
		    try {
		      assert a == 12; // Assertion without a fail message
		      assert a == 12 : "a is not 12";
		      assert a == 15 : "a is not 15";
		    } catch (AssertionError e) {
		      System.out.println(e.getMessage());
		    }
		  }
		}
//The assert keyword evaluates a boolean expression and throws an AssertionError exception if the expression 
//evaluates to false. When the exception is thrown we say that the assertion failed.
//
//An optional expression can be added which will be used as the exception message if the assertion fails.
//
//Assertions are disabled by default. assert statements are ignored unless assertions are enabled.
//
//The purpose of assertions is to clearly mark where a program is doing something unintended 
//when debugging and testing a program.

