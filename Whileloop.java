package javaOverview;

public class Whileloop {
	public static void main(String[] args) {
		int a=0;
		while(a<=10) {
			System.out.println(a);
			a++;
		}
	}

}

//While loop starts with the checking of Boolean condition. If it evaluated to true, then the loop body statements 
//are executed otherwise first statement following the loop is executed. For this reason 
//it is also called Entry control loop
//Once the condition is evaluated to true, the statements in the loop body are executed. 
//Normally the statements contain an update value for the variable being processed for the next iteration.
//When the condition becomes false, the loop terminates which marks the end of its life cycle.
