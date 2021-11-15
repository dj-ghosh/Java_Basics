package pattern;

public class Alphabet_Right_Triangle_Repeating {

	public static void main(String[] args) {
		int alphabet=64;	//ASCII value of CAP A is 65 but our i & j value is one so take 64
		int input=10;
		int number=1;
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(alphabet+number)+" ");//adds the value of number in the ASCII value of A and prints the corresponding alphabet
			}
			System.out.println();
			number++;  // Increment the value of number for next row;
		}

	}

}
