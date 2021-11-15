package pattern;

public class Number_14 {
	
	private static int input,number;

	public static void main(String[] args) {
		input = 7;
		number = input;  // As the starting number is the input number
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=input-i+1;j++) {
				System.out.print(number-- +" ");  //Decrement for each row
			}
			for(int j=1;j<=input-i+1;j++) {
				number++ ;  //Reset back to normal
			}
			System.out.println();
			number--; //Decrement by one for next row
		}
		
	}

}