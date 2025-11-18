package JavaKeywords;

public class Continue {
	public static void main(String[] args) {
		int i=0;
		while(i<7) {
			if(i==4) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}

//The continue keyword is used to end the current iteration in a for loop (or a while loop), and continues to the next iteration.
