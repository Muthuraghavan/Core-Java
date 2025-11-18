package JavaKeywords;

public class Default {
	public static void main(String[] args) {
		int day = 4;
		switch(day) {
		case 2:
			System.out.println("Today is greatday");
			break;
		case 3:
			System.out.println("Today is Delightfulday");
			break;
			default: 
				System.out.println("Looking for ah betterdays");
		}
	}

}

//The default keyword specifies the default block of code in a switch statement.
//
//The default keyword specifies some code to run if there is no case match in the switch.
//
//Note: if the default keyword is used as the last statement in a switch block, it does not need a break.
