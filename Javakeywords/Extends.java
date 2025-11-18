package JavaKeywords;

public class Extends {
	class Cricket{
		protected String brand = "MRF";
		public void bat() {
			System.out.println("First bat");
		}
	}
	class India extends Cricket{
		private int SerialNumber = 269;
		public static void main (String[] args) {
			India myIndia = new India();
			myIndia.bat();
			System.out.println(myIndia.brand);
			System.out.println(myIndia.SerialNumber);
			
		}
	}

}
