package getting_started;

public class Count_Digits_In_A_Number {

	public static void main(String[] args) {
		int number = 789; // Initial value of user input number
		int count = 0; // Initialize the counter as zero
		while (number!=0) { // Count until the quotient become zero
			number = number/10; // copy the value of value of quotient for the next round division
			count++; // Increment the counter
		}
		System.out.println(count);
	}
}