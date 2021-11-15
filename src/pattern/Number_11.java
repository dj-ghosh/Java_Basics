package pattern;

public class Number_11 {

	private static int input,number;

	public static void main(String[] args) {
		input = 8;
		number= 1;							
		for(int i=1;i<=input;i++) { 		// First part code of right angle triangle
			for(int j=1;j<=i;j++) { 
				System.out.print(number++ +" "); 
			}
			System.out.println(); // 
			number= 1;
		}
		for(int i=1;i<=input;i++) {			// Second part code of down right angle triangle
			for(int j=1;j<=input-i;j++) {	// BUt remove -1 as we need 1 row less for down triangle
				System.out.print(number++ +" "); 
			}
			System.out.println();
			number= 1;
		}

	}

}
