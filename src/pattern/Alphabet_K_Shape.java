package pattern;

public class Alphabet_K_Shape {

	private static int input;
	private static int alphabet;

	public static void main(String[] args) {
		input = 9;
		alphabet = 64;
		for(int i=input;i>=1;i--) {	//Prints upper half  pattern  
			for(int j=1;j<=i;j++) {
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
		for(int i=2;i<=input;i++) {  //Prints lower half  pattern  
			for(int j=1;j<=i;j++) {
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
	}

}