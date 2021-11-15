package pattern;

public class Star_Hollow_Triangle {

	private static int input;

	public static void main(String[] args) {
		input = 9;
		for(int i=1;i<=input;i++) { // Outer Loop For Row
			for(int j=1;j<=input-i;j++) { // Inner Loop For Column Space
				System.out.print(" "); // Print One Space of the Inner Loop
			}
			for(int j=1;j<=i;j++) { //Inner Loop For Column
				if((j==1 || j==i) || i==input)  // Print only for outer & base
				System.out.print("* "); // Print * of the Inner Loop
				else
				System.out.print("  "); //Print Space of the Inner Loop
			}
			System.out.println(); // To move to new row
		}

	}

}