package Java_Number_Programs;

public class Reverse_Number {

	public static void main(String[] args) {
		int input = 1234, remainder, reverse = 0;
		while (input !=0) {
			remainder = input % 10;
			reverse = reverse * 10 + remainder;
			input = input/10;
		}
		System.out.println(reverse);
		

	}

}
