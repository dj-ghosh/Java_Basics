package Java_Number_Programs;

public class Krishnamurthy_number {

	public static void main(String[] args) {
		int input = 145, remainder, factorial =1,result=0,i;
		while (input !=0) {
			remainder = input % 10;
			//System.out.println("@"+remainder);
			factorial = 1;
			for (i= remainder;i>0;i--)
			//System.out.print(i);
			factorial = factorial * i;
			//System.out.println("$"+factorial);
			result = result + factorial;
			//System.out.println("^"+result);
			input = input/10;
		}
		System.out.println(+result);

	}

}
