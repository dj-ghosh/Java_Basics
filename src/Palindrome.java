public class Palindrome {

	private static int sum,remainder,number,temporary_value;

	public static void main(String[] args) {
		number = 121;
		temporary_value = number; // Store the number in in temporary for later comparison
		sum = 0;
		while (number>0) {        
			remainder = (number%10);  // Get the remainder for each iteration
			sum = (sum*10)+remainder; // multiply sum with 10 for each unit digit & add remainder
			number = number/10; 	  // In each iteration last digit gets removed which we use in remainder
			
		}
		if (temporary_value == sum) 
			System.out.print("It is palindrome");
		else 
				System.out.println("It is not palindrome");
	}

}
