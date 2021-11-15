package pattern;

public class Number_13 {
	private static int input,number;

	public static void main(String[] args) {
		input = 9;
		number = 1;  // As the starting number is one
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=input-i+1;j++) {
				System.out.print(number++ +" ");  //Increment for each row
			}
			System.out.println();
			number = 1; //Reset Back to starting number as one
		}
		
	}

}