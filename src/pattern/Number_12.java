package pattern;

public class Number_12 {
	private static int input,number;

	public static void main(String[] args) {
		input = 9;
		number = input;  // As the starting number is the input number
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=input-i+1;j++) {
				System.out.print(number-- +" ");  //Decrement for each row
			}
			System.out.println();
			number = input; //Reset Back to starting number as the input number
		}
		
	}

}