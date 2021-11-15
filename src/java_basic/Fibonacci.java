package java_basic;

public class Fibonacci {
	private static int sum,previous,number,next;

	public static void main(String[] args) {
		number = 7;
		next = 1;
		for(int i = 0; i<number;i++) {
			System.out.print(" "+sum);
			previous = next;
			next = sum;
			sum = previous+next;
			
			
		}
		
	}

}
