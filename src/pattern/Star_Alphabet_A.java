package pattern;

public class Star_Alphabet_A {

	private static int input;

	public static void main(String[] args) {
		input = 8;
		for(int i=0;i<=input;i++) {
			for(int j=0;j<=input/2;j++) {
				if((j==0 || j==input/2) && i != 0 || i == 0  && j != input / 2 || i==input/2 )// Logic for where to print *
					System.out.print("*");
				else
					System.out.print(" "); // Logic for printing Space
			}
			System.out.println(); // For New Row
		}
	}

}
