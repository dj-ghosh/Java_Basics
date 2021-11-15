package java_basic;

public class Armstrong1 {

	private static int number,remainder,result,temporary_value,cube;

	public static void main(String[] args) {
		number = 1634;
		cube = 0;
		result = 0;
		temporary_value = number;
		while (number>=1) {
			remainder = number%10;   //Get Each remainder by dividing it by 10 like Palindrome.
			cube = remainder*remainder*remainder; // Cube of the each iteration of remainder 
			result = result+cube; // add each remainder in result
			number = number/10;
		}
		if (temporary_value == result) 
			System.out.print(result+" is Armstrong");
		else 
				System.out.println("The number is not Armstrong");
	}

}
