package pattern;

public class Alphabet_Triangle_Pyramid {

	private static int alphabet;

	public static void main(String[] args) {
		int input=9;
		alphabet = 64;
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=input-i;j++) { // For the Space
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) { // For printing the j
				System.out.print((char)(alphabet+j)+" "); //adds the value of number in the ASCII value of A and prints the corresponding alphabet
			}
			System.out.println();
		}

	}

}
