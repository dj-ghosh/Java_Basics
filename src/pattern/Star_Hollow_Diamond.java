package pattern;

public class Star_Hollow_Diamond {

	private static int input;

	public static void main(String[] args) {
		input = 8;
		for(int i=1;i<=input;i++) { // Outer Loop For Row
			for(int j=1;j<=input-i;j++) { // Inner Loop For Column Space
				System.out.print(" "); // Print One Space of the Inner Loop
			}
			for(int j=1;j<=2*i-1;j++) { //Inner Loop For Column
				if(j==1 || j==2*i-1)
				System.out.print("*"); // Print Space+ then* of the Inner Loop to align with below
				else
				System.out.print(" ");
			}
			System.out.println(); // To move to new row
		}
		for(int i=1;i<=input;i++) { // Outer Loop For Row
			for(int j=1;j<=i;j++) { // Inner Loop For Column Space
				System.out.print(" "); // Print One Space of the Inner Loop
			}
			for(int j=1;j<=2*(input-i)-1;j++) { //Inner Loop For Column
				if(j==1 || j==2*(input-i)-1)
				System.out.print("*"); // Print * then Space of the Inner Loop to align with above
				else
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}