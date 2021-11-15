package pattern;

public class Alphabet_Right_Triangle {

	public static void main(String[] args) {
		int input=8;
		int alphabet=64; //ASCII value of CAP A is 65 but our i & j value is one so take 64
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(alphabet+j)+" "); ////adds the value of j in the ASCII value of A and prints the corresponding alphabet  
			}
			System.out.println();
		}

	}

}
