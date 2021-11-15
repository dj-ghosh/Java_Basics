
package java_basic;
import  java.lang.Math;
public class Armstrong {

	public static void main(String[] args) {
		int number = 153;
		int sum = 0;
		int tempnum = number;
		String num = Integer.toString(number);
		while(number!=0) {
			int remainder = number%10;
			sum = sum+(int)Math.pow(remainder, num.length());
			number = number/10;
		}
		
		if(sum==tempnum) {
			System.out.println(tempnum+" is an armstrong  number");
		}
		else {
			System.out.println(tempnum+" is not an armstrong  number");
		}

	}

}
