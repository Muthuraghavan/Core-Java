package JavaKeywords;

public class Exports {
	public static void main(String[] args) {
		Module mymodule{
			Exports com.java.Array.ArrayExample1;
			Exports com.java.arraylist.ArrayListExample2 to Module.class;
			
			
		}
	}

}

//The exports keyword allows a package from a module to be used by other modules.
//
//If the to keyword is added, the exported package is only allowed to be used by the modules that are listed.
