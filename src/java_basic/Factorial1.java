package java_basic;

public class Factorial1 {

	private static int number,i,result;

	public static void main(String[] args) {
		number = 5;  // Number to calculate
		result = 1;
		
		for (i=1;i<=number;i++) { //Start from i up to number
			result = result*i;	// Multiply each iteration of incremented to result
		}
		System.out.println(result);

	}
}
