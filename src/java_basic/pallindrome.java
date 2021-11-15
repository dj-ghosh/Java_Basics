package java_basic;

public class pallindrome {

	public static void main(String[] args) {
		int number = 151;
		int tempnum = number;
		int sum = 0;
		while (number !=0) {
		int remainder = number%10;
		sum = (sum*10)+remainder;
		//System.out.println(remainder);
		number = number/10;
		}
		
		if (tempnum==sum) {
			System.out.println(tempnum+" is a pallindrome");
		}
		else {
			System.out.println(tempnum+" is not a pallindrome");
		}
	}
	

}
