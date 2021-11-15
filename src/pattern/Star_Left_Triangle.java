package pattern;

public class Star_Left_Triangle {

	private static int input;

	public static void main(String[] args) {
		input = 5;
		for(int i=1;i<=input;i++) { // Outer Loop For Row
			for(int j=1;j<=input-i;j++) { // Inner Loop For Column Space
				System.out.print("  "); // Print Space of the Inner Loop
			}
			for(int j=1;j<=i;j++) { //Inner Loop For Column
				System.out.print("* "); // Print * of the Inner Loop
			}
			System.out.println(); // To move to new row
		}
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("  "); //Use two space for aligning as Right Angle triangle
			}
			for(int j=1;j<=input-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
