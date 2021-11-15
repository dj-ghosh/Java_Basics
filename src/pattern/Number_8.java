package pattern;

public class Number_8 {

	private static int input,num;

	public static void main(String[] args) {
		input = 10;
		num = 0;
		for(int i=1;i<=input;i++) { // Outer Loop For Row
			for(int j=1;j<=input;j++) { // Inner Loop For Column
				System.out.print(num); // Print of the * of the Inner Loop
				num = (num == 0)? 1 : 0;  // if num zero then change to one for next iteration , vice versa
				//else
			//	System.out.print("1");
			
			}
			System.out.println(); // To move to new row
		}

	}

}