package pattern;

public class Number_10 {

	private static int input,number;

	public static void main(String[] args) {
		input = 10;
		number = 1;
		for(int i=1;i<=input;i++) {  //Reverse Pyramid
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=input-i+1;j++) {
				System.out.print(number++ +" "); //Increment for each line
			}
			for(int j=1;j<=input-i+1;j++) { // Inner Loop to decrement the number back to normal
				number--;
			}
			System.out.println();
			number++; //Increment by 1 for next row
		}
		number--;
		for(int i=1;i<=input;i++) {  //Pyramid
			for(int j=1;j<=input-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(number++ +" "); //Increment for each line
				
			}
			for(int j=1;j<=i;j++) {
			number--;		// Inner Loop to decrement the number back to normal
			}
			System.out.println();
			number--; // Decrement by 1 for next row
		}

	}

}
