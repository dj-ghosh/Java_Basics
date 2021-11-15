package pattern;

public class Number_7 {

	private static int input,number;


	public static void main(String[] args) {
		input = 8;
		number = 1;
		for(int i=1;i<=input;i++) { // Outer Loop For Row
			for(int j=1;j<=i;j++) { // Inner Loop For Column
				System.out.print(number-- +" "); // Print of the * of the Inner Loop			
			}
			for(int j=1;j<=i;j++) { // Inner Loop to increment the number back to normal
				number++;
			}
			System.out.println(); // To move to new row
			number++;
		}

	}

}