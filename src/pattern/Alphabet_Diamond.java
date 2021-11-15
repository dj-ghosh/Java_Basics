package pattern;

public class Alphabet_Diamond {

	private static int input,alphabet,number;

	public static void main(String[] args) {
		input = 16;
		number = 1;
		alphabet= 64;
		for(int i=1;i<=input;i++) { // Outer Loop For Row
			for(int j=1;j<=input-i;j++) { // Inner Loop For Column Space
				System.out.print(" "); // Print One Space of the Inner Loop
			}
			for(int j=1;j<=2*i-1;j++) { //Inner Loop For Column
				if(j==1 || j==2*i-1)
				System.out.print((char)(alphabet+number)); // Print Space+ then* of the Inner Loop to align with below
				else
				System.out.print(" ");
			}
			System.out.println(); // To move to new row
			number++;
		}
		number=input-1;
		for(int i=1;i<=input;i++) { // Outer Loop For Row
			for(int j=1;j<=i;j++) { // Inner Loop For Column Space
				System.out.print(" "); // Print One Space of the Inner Loop
			}
			for(int j=1;j<=2*(input-i)-1;j++) { //Inner Loop For Column
				if(j==1 || j==2*(input-i)-1)
				System.out.print((char)(alphabet+number)); // Print * then Space of the Inner Loop to align with above
				else
				System.out.print(" ");
			}
			System.out.println();
			number--;
		}

	}

}