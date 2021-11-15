package getting_started;

public class Inverse_Of_A_Number {

	public static void main(String[] args) {
		int number = 1234;
		int count = 0;
		int remainder = 0;
		int total = 0;
		int sum = 0;
		while (number!=0) {
			remainder = number%10;
			number = number/10;
			count++;
			total += (int) (count*Math.pow(10, remainder-1));
			//sum = sum + total;
		}
		System.out.println(total);

	}

}
