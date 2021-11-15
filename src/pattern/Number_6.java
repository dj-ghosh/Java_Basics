package pattern;

public class Number_6 {

	private static int input,number;

	public static void main(String[] args) {
		input = 8;
		number = input;
		for(int i=1;i<=input;i++) { // Outer Loop For Row
			for(int j=1;j<=i;j++) { // Inner Loop For Column
				System.out.print(number-- +" "); // Print of the * of the Inner Loop
			}
			System.out.println(); // To move to new row
			number = input;
		}

	}

}