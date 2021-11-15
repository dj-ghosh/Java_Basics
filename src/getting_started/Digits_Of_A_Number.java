package getting_started;

public class Digits_Of_A_Number {

	public static void main(String[] args) {
		int number = 789;
		int remainder = 0;
		while(number!=0) {
			remainder = number%10;
			System.out.print(remainder);
			number = number/10;
		}

	}

}
